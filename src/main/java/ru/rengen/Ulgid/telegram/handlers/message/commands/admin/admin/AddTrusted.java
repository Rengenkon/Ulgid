package ru.rengen.Ulgid.telegram.handlers.message.commands.admin.admin;

import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import ru.rengen.Ulgid.telegram.handlers.message.commands.admin.AdminCommand;

@Component
public class AddTrusted implements AdminCommand {
    @Override
    public String getCommand() {
        return "/add-trusted";
    }

    @Override
    public String description() {
        return "Генерирует код для админа доверенного уровня";
    }

    @Override
    public Integer level() {
        return 2;
    }

    @Override
    public SendMessage doSomethings(Message message) {
        return null;
    }
}
