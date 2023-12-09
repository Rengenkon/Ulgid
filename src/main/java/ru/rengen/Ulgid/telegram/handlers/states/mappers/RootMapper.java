package ru.rengen.Ulgid.telegram.handlers.states.mappers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Message;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Component
public class RootMapper{
    private Map<String, StateMapper> mappers;

    @Autowired
    private RootMapper(List<StateMapper> stateMappers) {
        this.mappers = stateMappers.stream().collect(Collectors.toMap(StateMapper::getRole, map -> map));
    }

    public void parse(Iterator<String> iterator, TelegramLongPollingBot bot, Message message) {
        if (!iterator.hasNext()){
            throw new RuntimeException("Iterator is empty");
        }
        String role = iterator.next();
        if (!mappers.containsKey(role)) {
            throw new RuntimeException("Unknown role" + role);
        }
        mappers.get(role).parse(iterator,bot, message);
    }
}
