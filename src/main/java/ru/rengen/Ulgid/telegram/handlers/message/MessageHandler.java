package ru.rengen.Ulgid.telegram.handlers.message;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.interfaces.BotApiObject;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import ru.rengen.Ulgid.telegram.handlers.Handler;
import ru.rengen.Ulgid.telegram.handlers.message.commands.Command;
import ru.rengen.Ulgid.telegram.handlers.message.commands.CommandList;
import ru.rengen.Ulgid.telegram.handlers.states.*;
import ru.rengen.Ulgid.telegram.handlers.states.mappers.RootMapper;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


@Component
@Slf4j
public class MessageHandler implements Handler {
    private MyState states;
    private Map<String, Map<String, Command>>  roleCommands;
    private RootMapper rootMapper;


    @Autowired
    private MessageHandler(List<CommandList> commands, MyState states, RootMapper rootMapper) {
        //Переписать CommandList, сделать мапу внатри
        roleCommands = commands.stream().collect(Collectors.toMap(group -> group.getRole(), CommandList::getCommands));
        this.states = states;
        this.rootMapper = rootMapper;
    }

    @Override
    public String getName() {
        return "MessageHandler";
    }

    @Override
    public void parse(TelegramLongPollingBot bot, BotApiObject object) {
        Message message = (Message) object;
        boolean isState = false;

        if (message.hasText()) {
            isState = text(bot, message);
        }


        if (isState) {
            rootMapper.parse(states.getAll(message.getChatId()), bot, message);
        }
    }

    private boolean text(TelegramLongPollingBot bot, Message message) {
        String text = message.getText();
        var commands = roleCommands.get(states.getFirstState(message.getChatId()));


        //выделение команды


        try {
            if (commands.containsKey(text)) {
                bot.execute(commands.get(text).doSomethings(message));
            } else if (states.isDefault(message.getChatId())) {// В дефолтном сотоянии могут быть только команды
                bot.execute(SendMessage.builder()
                        .text("Такой команды нет")
                        .chatId(message.getChatId())
                        .build());
            } else {
                return true;
            }
        } catch (TelegramApiException e) {
            log.error("Error sending message. " + e.getMessage());
        }
        return false;
    }
}
