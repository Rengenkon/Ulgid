package ru.rengen.ulgidtelegram.handlers;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.interfaces.BotApiObject;

public interface Handler {
    String getName();// used to map in UlgidBot
    void parse(TelegramLongPollingBot bot, BotApiObject object);
}
