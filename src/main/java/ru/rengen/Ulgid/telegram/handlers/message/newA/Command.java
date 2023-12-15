package ru.rengen.Ulgid.telegram.handlers.message.newA;

import org.telegram.telegrambots.bots.DefaultAbsSender;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public interface Command {
    //регистрируем команду в конструкторе
    String getCommand();
    String getDescription();
    void exe(DefaultAbsSender bot, Message message) throws TelegramApiException;
}