package ru.rengen.Ulgid.telegram.handlers.message.commands.admin.trusted;

import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import ru.rengen.Ulgid.telegram.handlers.message.commands.admin.AdminCommand;

@Component
public class ApproveCompany implements AdminCommand {
    @Override
    public String getCommand() {
        return "/approve-company";
    }

    @Override
    public String description() {
        return "Одобряет компанию";
    }

    @Override
    public SendMessage doSomethings(Message message) {
        return null;
    }
}
