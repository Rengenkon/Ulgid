package ru.rengen.Ulgid.telegram.handlers.message.commands.user;

import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;

@Component
public class Report implements UserCommand{
    @Override
    public String getCommand() {
        return "/report";
    }

    @Override
    public String description() {
        return "Позваляет пожаловать на мероприятие или компанию";
    }

    @Override
    public SendMessage doSomethings(Message message) {
        return null;
    }
}
