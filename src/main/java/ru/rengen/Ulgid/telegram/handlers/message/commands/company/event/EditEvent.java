package ru.rengen.Ulgid.telegram.handlers.message.commands.company.event;

import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import ru.rengen.Ulgid.telegram.handlers.message.commands.company.CompanyCommand;

@Component
public class EditEvent implements CompanyCommand {
    @Override
    public String getCommand() {
        return "/edit-event";
    }

    @Override
    public String description() {
        return "Позволяет изменить мероприятие";
    }

    @Override
    public SendMessage doSomethings(Message message) {
        return null;
    }
}
