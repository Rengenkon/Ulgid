package ru.rengen.Ulgid.telegram.handlers.message.commands.user.interfaces;

import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import ru.rengen.Ulgid.telegram.handlers.message.commands.user.UserCommand;

@Component
public class Admin implements UserCommand, Interface {
    @Override
    public String getCommand() {
        return "/admin";
    }

    @Override
    public String description() {
        return "Переключение в админский интерфейс";
    }

    @Override
    public SendMessage doSomethings(Message message) {
        return null;
    }

    @Override
    public Integer level() {
        return 1;
    }
}
