package ru.rengen.Ulgid.telegram.logic.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import ru.rengen.Ulgid.telegram.logic.user.UserLogicList.UserLogic;
import ru.rengen.Ulgid.validators.user.GetEvents;

@Component
public class FindEvents extends UserLogic {
    @Autowired
    GetEvents events;

    @Override
    public String myState() {
        return "FiEv";
    }

    @Override
    public SendMessage firstCall(Long chatId) {
        StringBuilder builder = new StringBuilder();
        for (var event : events.getEvents()) {
            builder.append(event.toString()).append("\n");
        }
        return SendMessage.builder()
                .text(builder.toString())
                .chatId(chatId)
                .build();
    }

    @Override
    public void nextCAll(TelegramLongPollingBot bot, Message message) throws TelegramApiException {

    }
}
