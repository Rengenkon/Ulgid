package ru.rengen.Ulgid.telegram.handlers.states.mappers;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Message;

import java.util.Iterator;

public interface StateMapper {
     void parse(Iterator<String> iterator, TelegramLongPollingBot bot, Message message);
     String getRole();
}
