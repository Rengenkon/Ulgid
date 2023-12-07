package ru.rengen.Ulgid.telegram.handlers.message.commands.company.event;

import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import ru.rengen.Ulgid.telegram.handlers.message.commands.company.CompanyCommand;

@Component
public class ShowAllEvents implements CompanyCommand {
    @Override
    public String getCommand() {
        return "/show-all";
    }

    @Override
    public String description() {
        return "Показывает все ваши мероприятия";
    }

    @Override
    public SendMessage doSomethings(Message message) {
        return null;
    }
}
