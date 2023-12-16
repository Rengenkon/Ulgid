package ru.rengen.Ulgid.telegram.handlers.message.commands;

import org.telegram.telegrambots.bots.DefaultAbsSender;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public interface Command {
    String getCommand();
    String getDescription();
    void exe(DefaultAbsSender bot, Message message) throws TelegramApiException;
    String getRole();
}
