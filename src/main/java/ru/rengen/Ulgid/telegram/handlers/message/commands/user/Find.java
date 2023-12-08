package ru.rengen.Ulgid.telegram.handlers.message.commands.user;

import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;

@Component
public class Find implements UserCommand {
    @Override
    public String getCommand() {
        return "/find";
    }

    @Override
    public String description() {
        return "Выдает подборку мероприятий";
    }

    @Override
    public SendMessage doSomethings(Message message) {
        return null;
    }
}