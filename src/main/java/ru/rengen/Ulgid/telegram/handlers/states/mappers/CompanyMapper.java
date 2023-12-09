package ru.rengen.Ulgid.telegram.handlers.states.mappers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import ru.rengen.Ulgid.telegram.handlers.message.commands.company.CompanyCommandsList;
import ru.rengen.Ulgid.telegram.handlers.states.Roles;
import ru.rengen.Ulgid.telegram.logic.Logic;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@Component
class CompanyMapper implements StateMapper {
    private Map<String, Logic> stateLogic;

    @Autowired
    private CompanyMapper(CompanyCommandsList list) {
        stateLogic = new HashMap<>();
        for (var command : list.getCommands().values()) {
            var logic = command.getLogic();
            stateLogic.put(logic.myState(), logic);
        }
    }

    @Override
    public void parse(Iterator<String> iterator, TelegramLongPollingBot bot, Message message) {
        try {
            stateLogic.get(iterator.next()).nextCAll(bot, message);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public String getRole() {
        return Roles.COMPANY;
    }
}
