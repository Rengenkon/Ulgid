package ru.rengen.Ulgid.telegram.handlers.message.commands.admin;

import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;

@Component
public class Edit implements AdminCommand {
    @Override
    public String getCommand() {
        return "/edit";
    }

    @Override
    public String description() {
        return "Редактирует последнее решение";
    }

    @Override
    public SendMessage doSomethings(Message message) {
        return null;
    }
}
