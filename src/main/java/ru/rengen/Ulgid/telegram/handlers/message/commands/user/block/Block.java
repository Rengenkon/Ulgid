package ru.rengen.Ulgid.telegram.handlers.message.commands.user.block;

import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import ru.rengen.Ulgid.telegram.handlers.message.commands.user.UserCommand;

@Component
public class Block implements UserCommand, Blockk {
    @Override
    public String getCommand() {
        return "/block";
    }

    @Override
    public String description() {
        return "Позволяет заблокировать компанию. Заблокированная компания не показывается";
    }

    @Override
    public SendMessage doSomethings(Message message) {
        return null;
    }
}
