package ru.rengen.Ulgid.telegram.handlers.message.commands.admin.moderator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.rengen.Ulgid.telegram.handlers.message.commands.admin.AdminCommandsList.AdminCommand;
import ru.rengen.Ulgid.telegram.logic.admin.ModeratorApprove;

@Component
public class ApproveEvent extends AdminCommand {
    @Autowired
    private ApproveEvent(ModeratorApprove logic) {
        this.logic = logic;
    }

    @Override
    public String getCommand() {
        return "/approve";
    }

    @Override
    public String description() {
        return "Одобряет мероприятие на публикацию";
    }
}
