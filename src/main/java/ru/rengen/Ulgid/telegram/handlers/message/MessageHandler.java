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

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


@Component
@Slf4j
public class MessageHandler implements Handler {
    private MyState states;
    private Map<String, Map<String, Command>>  roleCommands;


    @Autowired
    private MessageHandler(List<CommandList> commands, MyState states) {
        roleCommands = commands.stream().collect(Collectors.toMap(group -> group.getRole().getName(), CommandList::getCommands));
        this.states = states;
    }

    @Override
    public String getName() {
        return "MessageHandler";
    }

    @Override
    public void parse(TelegramLongPollingBot bot, BotApiObject object) {
        Message message = (Message) object;
        String text = message.getText();

        String state = states.getState(message.getChatId());
        var commands = roleCommands.get(state);


        //выделение команды

        SendMessage msg;
        if (commands.containsKey(text)) {
            msg = commands.get(text).doSomethings(message);
        } else if (states.isSimple(state)) {
            msg = SendMessage.builder()
                    .text("Такой команды нет")
                    .chatId(message.getChatId())
                    .build();
        } else {
            msg = StateMapper.parse(bot, message);
        }
        try {
            bot.execute(msg);
        } catch (TelegramApiException e) {
            log.error("Error sending message. " + e.getMessage());
        }
    }
}
