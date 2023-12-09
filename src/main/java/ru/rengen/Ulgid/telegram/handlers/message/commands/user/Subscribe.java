package ru.rengen.Ulgid.telegram.handlers.message.commands.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import ru.rengen.Ulgid.telegram.handlers.message.commands.user.UserCommandsList.UserCommand;
import ru.rengen.Ulgid.telegram.logic.user.ReportEvent;
import ru.rengen.Ulgid.telegram.logic.user.SubscribeCompany;

@Component
public class Subscribe extends UserCommand {
    @Autowired
    private Subscribe(SubscribeCompany logic) {
        this.logic = logic;
    }

    @Override
    public String getCommand() {
        return "/subscribe";
    }

    @Override
    public String description() {
        return "Позволяет подписаться на все новые мероприятия этого организатора";
    }
}
