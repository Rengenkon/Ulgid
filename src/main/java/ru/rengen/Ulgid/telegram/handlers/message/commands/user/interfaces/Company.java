package ru.rengen.Ulgid.telegram.handlers.message.commands.user.interfaces;

import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import ru.rengen.Ulgid.telegram.handlers.message.commands.user.UserCommand;

@Component
public class Company extends Interface implements UserCommand {
    @Override
    public String getCommand() {
        return "/company";
    }

    @Override
    public String description() {
        return "Позволяет перейти в интерфейс компании";
    }

    @Override
    public SendMessage doSomethings(Message message) {
        switcher.company(message.getChatId());
        return SendMessage.builder()
                .text("Переключение режима")
                .chatId(message.getChatId())
                .build();
    }
}
