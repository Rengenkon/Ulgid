package ru.rengen.Ulgid.telegram.handlers.states.mappers;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Message;
import ru.rengen.Ulgid.telegram.handlers.states.Roles;

import java.util.Iterator;

public class AdminMapper implements StateMapper {
    @Override
    public void parse(Iterator<String> iterator, TelegramLongPollingBot bot, Message message) {

    }

    @Override
    public String getRole() {
        return Roles.ADMIN;
    }
}
