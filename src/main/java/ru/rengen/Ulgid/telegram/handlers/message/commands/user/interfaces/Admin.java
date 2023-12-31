package ru.rengen.Ulgid.telegram.handlers.message.commands.user.interfaces;

import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import ru.rengen.Ulgid.telegram.logic.Logic;

@Component
public class Admin extends Interface{
    @Override
    public String getCommand() {
        return "/admin";
    }

    @Override
    public String description() {
        return "Переключение в админский интерфейс";
    }

    @Override
    public Integer level() {
        return 1;
    }

    @Override
    public Logic getLogic() {
        return switcher;
    }

    @Override
    public SendMessage doSomethings(Message message) {
        switcher.admin(message.getChatId());
        return SendMessage.builder()
                .text("Переключение режима")
                .chatId(message.getChatId())
                .build();
    }
}
