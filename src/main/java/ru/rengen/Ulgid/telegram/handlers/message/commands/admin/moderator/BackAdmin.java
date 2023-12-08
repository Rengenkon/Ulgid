package ru.rengen.Ulgid.telegram.handlers.message.commands.admin.moderator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import ru.rengen.Ulgid.telegram.handlers.message.commands.admin.AdminCommand;
import ru.rengen.Ulgid.telegram.logic.IntarfaceSwitcher;

@Component
public class BackAdmin implements AdminCommand {
    @Autowired
    IntarfaceSwitcher switcher;

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
        switcher.user(message.getChatId());
        return SendMessage.builder()
                .text("Переключение режима")
                .chatId(message.getChatId())
                .build();
    }
}
