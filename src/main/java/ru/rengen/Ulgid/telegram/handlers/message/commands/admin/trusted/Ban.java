package ru.rengen.Ulgid.telegram.handlers.message.commands.admin.trusted;

import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import ru.rengen.Ulgid.telegram.handlers.message.commands.admin.AdminCommand;

@Component
public class Ban implements AdminCommand {
    @Override
    public String getCommand() {
        return "/ban";
    }

    @Override
    public String description() {
        return "Банит компанию";
    }

    @Override
    public Integer level() {
        return 1;
    }

    @Override
    public SendMessage doSomethings(Message message) {
        return null;
    }
}
