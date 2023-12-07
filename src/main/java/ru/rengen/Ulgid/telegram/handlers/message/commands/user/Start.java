package ru.rengen.Ulgid.telegram.handlers.message.commands.user;

import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;

@Component
public class Start implements UserCommand {

    @Override
    public String getCommand() {
        return "/start";
    }

    @Override
    public String description() {
        return "Команда для старта бота";
    }

    @Override
    public SendMessage doSomethings(Message message) {
        return SendMessage.builder()
                .text("Привет")
                .chatId(message.getChatId())
                .build();
    }
}
