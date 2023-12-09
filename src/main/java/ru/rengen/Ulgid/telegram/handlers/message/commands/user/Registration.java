package ru.rengen.Ulgid.telegram.handlers.message.commands.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.rengen.Ulgid.telegram.handlers.message.commands.user.UserCommandsList.UserCommand;
import ru.rengen.Ulgid.telegram.logic.user.RegEvent;

@Component
public class Registration extends UserCommand {
    @Autowired
    private Registration(RegEvent logic) {
        this.logic = logic;
    }

    @Override
    public String getCommand() {
        return "/reg";
    }

    @Override
    public String description() {
        return "Позволяет записаться на мероприятие";
    }
}
