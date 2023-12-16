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
import ru.rengen.Ulgid.telegram.MyStateMachine;
import ru.rengen.Ulgid.telegram.handlers.Mapper;


@Component
@Slf4j
public class MessageHandler implements Handler {
    @Autowired
    private MyStateMachine states;
    @Autowired
    private Mapper mapper;

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
            mapper.executeLogic(states.getAll(message.getChatId()), bot, message);
        }
    }

    private boolean text(TelegramLongPollingBot bot, Message message) {
        String text = message.getText();
        var commands = mapper.getCommands(states.getFirstState(message.getChatId()));


        //выделение команды


        try {
            if (commands.containsKey(text)) {
                commands.get(text).exe(bot, message);
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
