package ru.rengen.Ulgid.telegram.handlers.message.commands.admin.moderator;

import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import ru.rengen.Ulgid.telegram.handlers.message.commands.admin.AdminCommand;

@Component
public class BackAdmin implements AdminCommand {
    @Override
    public String getCommand() {
        return "/user";
    }

    @Override
    public String description() {
        return "Переключение в пользовательский интерфейс";
    }

    @Override
    public SendMessage doSomethings(Message message) {
        return null;
    }
}
