package ru.rengen.Ulgid.telegram.handlers.message.commands.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import ru.rengen.Ulgid.telegram.handlers.message.commands.admin.AdminCommandsList.AdminCommand;
import ru.rengen.Ulgid.telegram.logic.Logic;
import ru.rengen.Ulgid.telegram.logic.SwitcherInterface;

@Component
public class BackAdmin extends AdminCommand {
    @Autowired
    SwitcherInterface switcher;

    @Override
    public String getCommand() {
        return "/user";
    }

    @Override
    public String description() {
        return "Переключение в пользовательский интерфейс";
    }

    @Override
    public Logic getLogic() {
        return switcher;
    }

    @Override
    public SendMessage doSomethings(Message message) {
        switcher.user(message.getChatId());
        return SendMessage.builder()
                .text("Переключение режима")
                .chatId(message.getChatId())
                .build();
    }
}
