package ru.rengen.Ulgid.telegram.handlers.message.commands.admin.moderator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.rengen.Ulgid.telegram.handlers.message.commands.admin.AdminCommandsList.AdminCommand;
import ru.rengen.Ulgid.telegram.logic.admin.ModeratorEdit;

@Component
public class Edit extends AdminCommand {
    @Autowired
    private Edit(ModeratorEdit logic) {
        this.logic = logic;
    }

    @Override
    public String getCommand() {
        return "/edit";
    }

    @Override
    public String description() {
        return "Редактирует последнее решение";
    }
}
