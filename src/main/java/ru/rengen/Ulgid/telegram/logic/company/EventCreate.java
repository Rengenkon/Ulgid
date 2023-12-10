package ru.rengen.Ulgid.telegram.logic.company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import ru.rengen.Ulgid.telegram.logic.company.CompanyLogicList.CompanyLogic;
import ru.rengen.Ulgid.validators.company.CreateEventValid;

@Component
public class EventCreate extends CompanyLogic {
    @Autowired
    CreateEventValid creator;

    @Override
    public String myState() {
        return "CrEv";
    }

    @Override
    public SendMessage firstCall(Long chatId) {
        states.addState(chatId, myState());
        String state = creator.getFirstState();
        states.addState(chatId, state);
        String text = creator.getQuestion(state);
        return SendMessage.builder()
                .text(text)
                .chatId(chatId)
                .build();
    }

    @Override
    public void nextCAll(TelegramLongPollingBot bot, Message message) throws TelegramApiException {
        if (!message.hasText()){
            //Отправил какую-то фигню
            return;
        }
        String sendText;
        String text = message.getText();
        Long id = message.getChatId();
        String state = states.removeLastState(id);
        String error = creator.validateAnswer(state, text);
        if (error == null) {
            states.addState(id, text);
            if (creator.isFinalState(state)) {
                create(id);
                sendText = "Мероприятие успешно создана";
            }else {
                state = creator.getNextState(state);
                states.addState(id, state);
                sendText = creator.getQuestion(state);
            }
        } else {
            sendText = error + "\n\n" + creator.getQuestion(state);
        }
        bot.execute(SendMessage.builder()
                .text(sendText)
                .chatId(id)
                .build());
    }

    private void create(Long id) {
        String tags = states.removeLastState(id);
        String name = states.removeLastState(id);
        creator.createEvent(id, name, tags);
        states.removeLastState(id);
    }
}
