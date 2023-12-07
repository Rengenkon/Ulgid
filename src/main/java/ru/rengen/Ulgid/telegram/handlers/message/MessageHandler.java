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
import ru.rengen.Ulgid.telegram.handlers.roles.Admin;
import ru.rengen.Ulgid.telegram.handlers.roles.Role;
import ru.rengen.Ulgid.telegram.handlers.roles.User;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


@Component
@Slf4j
public class MessageHandler implements Handler {
    private Map<String, Map<String, Command>>  roleCommands;

    @Autowired
    private MessageHandler(List<CommandList> commands) {
        roleCommands = commands.stream().collect(Collectors.toMap(group -> group.getRole().getName(), CommandList::getCommands));
    }

    @Override
    public String getName() {
        return "MessageHandler";
    }

    @Override
    public void parse(TelegramLongPollingBot bot, BotApiObject object) {
        Message message = (Message) object;
        String text = message.getText();

        String role = new User().getName();
        var commands = roleCommands.get(role);


        //выделение команды


        if (commands.containsKey(text)) {
            SendMessage msg = commands.get(text).doSomethings(message);
            try {
                bot.execute(msg);
            } catch (TelegramApiException e) {
                log.error("Error sending message. " + e.getMessage());
            }
        }else {
            try {
                bot.execute(SendMessage.builder()
                        .text("Такой команды нет")
                        .chatId(message.getChatId())
                        .build());
            } catch (TelegramApiException e) {
                log.error("Error sending message. " + e.getMessage());
            }
        }
    }
}
