package ru.rengen.Ulgid.telegram.handlers.message.commands;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;

import java.util.List;

public abstract class BaseHelp implements Command {
    protected String commands;

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

    protected String getCommands(List<? extends Command> list) {
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
