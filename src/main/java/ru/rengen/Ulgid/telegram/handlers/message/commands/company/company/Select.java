package ru.rengen.Ulgid.telegram.handlers.message.commands.company.company;

import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import ru.rengen.Ulgid.telegram.handlers.message.commands.company.CompanyCommand;

@Component
public class Select implements CompanyCommand {
    @Override
    public String getCommand() {
        return "/select";
    }

    @Override
    public String description() {
        return "Позволяет выбрать копанию";
    }

    @Override
    public SendMessage doSomethings(Message message) {
        return null;
    }
}
