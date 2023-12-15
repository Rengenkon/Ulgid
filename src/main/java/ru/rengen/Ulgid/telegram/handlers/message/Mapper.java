package ru.rengen.Ulgid.telegram.handlers.message;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.DefaultAbsSender;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import ru.rengen.Ulgid.telegram.handlers.message.newA.Command;
import ru.rengen.Ulgid.telegram.handlers.message.newA.CommandList;
import ru.rengen.Ulgid.telegram.handlers.message.newA.StateCommand;
import ru.rengen.Ulgid.telegram.logic.Logic;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@Component
public class Mapper {
    private Map<String, Map<String, Command>> roleCommand;
    private Map<String, Map<String, Logic>> roleState;

    @Autowired
    private Mapper(List<CommandList> lists) {
        roleCommand = new HashMap<>();
        roleState = new HashMap<>();
        for (CommandList list : lists) {
            Map<String, Command> commands = new HashMap<>();
            Map<String, Logic> logics = new HashMap<>();
            for (Command command : list.getCommands()) {
                commands.put(command.getCommand(), command);
                if (command instanceof StateCommand) {
                    Logic logic = ((StateCommand)command).getLogic();
                    logics.put(logic.myState(), logic);
                }
            }
            roleCommand.put(list.getRole(), commands);
            roleState.put(list.getRole(), logics);
        }
    }

    public Map<String, Command> getCommands(String role) {
        return roleCommand.get(role);
    }

    public void executeLogic(Iterator<String> iterator, DefaultAbsSender bot, Message message) {
        try {
            roleState.get(iterator.next())
                    .get(iterator.next())
                    .nextCAll(bot, message);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }
}
