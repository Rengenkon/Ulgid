package ru.rengen.Ulgid.telegram.handlers.message.commands.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import ru.rengen.Ulgid.telegram.handlers.message.commands.Command;
import ru.rengen.Ulgid.telegram.handlers.message.commands.user.UserCommandsList.UserCommand;
import ru.rengen.Ulgid.telegram.logic.NoneLogic;

import java.util.List;

@Component
public class HelpUser extends UserCommand {
    protected String commands;

    @Autowired
    private HelpUser(List<UserCommand> list, NoneLogic logic) {
        list.add(this);
        commands = getCommands(list);
        this.logic = logic;
    }

    @Override
    public String getCommand() {
        return "/help";
    }

    @Override
    public String description() {
        return "Список доступных команд и их описание";
    }

    @Override
    public SendMessage doSomethings(Message message) {
        return SendMessage.builder()
                .text(commands)
                .chatId(message.getChatId())
                .build();
    }

    private String getCommands(List<? extends Command> list) {
        StringBuilder builder = new StringBuilder();
        for (Command command : list) {
            builder.append(command.getCommand())
                    .append(" - ")
                    .append(command.description())
                    .append("\n");
        }
        return builder.toString();
    }
}
