package ru.rengen.Ulgid.telegram.handlers.message.commands.user;

import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;

@Component
public class Subscribe implements UserCommand{
    @Override
    public String getCommand() {
        return "/subscribe";
    }

    @Override
    public String description() {
        return "Позволяет подписаться на все новые мероприятия этого организатора";
    }

    @Override
    public SendMessage doSomethings(Message message) {
        return null;
    }
}
