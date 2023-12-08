package ru.rengen.Ulgid.telegram.logic.company;

import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;

@Component
public class CompanyCreate extends CompanyLogic {
    String state = "CC";
    String[] questions = new String[]{
            "",
            ""
    };

    @Override
    public SendMessage first(Long chatId) {
        states.addState(chatId, state);
        int number = 0;
        states.addState(chatId, "" + number);
        return SendMessage.builder()
                .text(questions[number])
                .chatId(chatId)
                .build();
    }

    @Override
    public void second(TelegramLongPollingBot bot, Message message) {
        Long id = message.getChatId();
        int number = Integer.parseInt(states.getLastState(id));
        String text = message.get


        if (number < questions.length) {
            states.removeLastState(id);
            states.addState(id, text);
            states.addState(id, "" + number);
        } else {

        }
    }

    @Override
    public SendMessage firstCall(Long chatId) {

    }

    @Override
    public void nextCAll(TelegramLongPollingBot bot, Message message) {

    }
}
