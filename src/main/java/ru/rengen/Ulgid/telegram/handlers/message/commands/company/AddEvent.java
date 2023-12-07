package ru.rengen.Ulgid.telegram.handlers.message.commands.company;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;

public class AddEvent implements CompanyCommand {
    @Override
    public String getCommand() {
        return "/add";
    }

    @Override
    public String description() {
        return "Создает новое мероприятие";
    }

    @Override
    public SendMessage doSomethings(Message message) {
        return null;
    }
}
