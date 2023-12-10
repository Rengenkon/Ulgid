package ru.rengen.Ulgid.telegram.handlers.message.commands.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import ru.rengen.Ulgid.telegram.handlers.message.commands.user.UserCommandsList.UserCommand;
import ru.rengen.Ulgid.telegram.logic.Logic;
import ru.rengen.Ulgid.telegram.logic.NoneLogic;

@Component
public class Start extends UserCommand {
    @Autowired
    NoneLogic none;

    @Override
    public String getCommand() {
        return "/start";
    }

    @Override
    public String description() {
        return "Команда для старта бота";
    }

    @Override
    public Logic getLogic() {
        return none;
    }

    @Override
    public SendMessage doSomethings(Message message) {
        return SendMessage.builder()
                .text("Привет")
                .chatId(message.getChatId())
                .build();
    }
}
