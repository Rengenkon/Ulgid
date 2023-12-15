package ru.rengen.Ulgid.telegram.logic;

import org.springframework.beans.factory.annotation.Autowired;
import org.telegram.telegrambots.bots.DefaultAbsSender;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import ru.rengen.Ulgid.telegram.handlers.states.MyState;

public abstract class Logic{
    @Autowired
    protected MyState states;
    abstract public String myState();
    abstract public SendMessage firstCall(DefaultAbsSender bot, Message message);
    abstract public void nextCAll(DefaultAbsSender bot, Message message) throws TelegramApiException;
}
