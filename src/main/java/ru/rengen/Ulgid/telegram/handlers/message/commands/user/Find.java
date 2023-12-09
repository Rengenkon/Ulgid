package ru.rengen.Ulgid.telegram.handlers.message.commands.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.rengen.Ulgid.telegram.logic.user.FindEvents;

@Component
public class Find extends UserCommandsList.UserCommand {
    @Autowired
    private Find(FindEvents logic) {
        this.logic = logic;
    }

    @Override
    public String getCommand() {
        return "/find";
    }

    @Override
    public String description() {
        return "Выдает подборку мероприятий";
    }
}
