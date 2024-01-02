package ru.rengen.ulgidtelegram.handlers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.DefaultAbsSender;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import ru.rengen.ulgidtelegram.handlers.message.commands.Command;
import ru.rengen.ulgidtelegram.handlers.message.commands.StateCommand;
import ru.rengen.ulgidtelegram.logic.Logic;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@Component
public class Mapper {
    private final Map<String, Map<String, Command>> roleCommand;
    private final Map<String, Map<String, Logic>> roleState;

    @Autowired
    private Mapper(List<Command> list) {
        roleCommand = new HashMap<>();
        roleState = new HashMap<>();

        for (Command command : list) {
            Map<String, Command> commands;
            Map<String, Logic> logics;
            var role = command.getRole();
            commands = roleCommand.get(role);
            if (commands == null) {
                commands = new HashMap<>();
                logics = new HashMap<>();

                roleCommand.put(role, commands);
                roleState.put(role, logics);
            } else {
                logics = roleState.get(role);
            }

            commands.put(command.getCommand(), command);
            if (command instanceof StateCommand) {
                Logic logic = ((StateCommand)command).getLogic();
                logics.put(logic.myState(), logic);
            }
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
