package ru.rengen.Ulgid.telegram.logic.admin;

import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import ru.rengen.Ulgid.telegram.logic.admin.AdminLogicList.AdminLogic;

@Component
public class AdminTrustedDelete extends AdminLogic {

    @Override
    public String myState() {
        return "DelT";
    }

    @Override
    public SendMessage firstCall(Long chatId) {
        return null;
    }

    @Override
    public void nextCAll(TelegramLongPollingBot bot, Message message) throws TelegramApiException {

    }
}
