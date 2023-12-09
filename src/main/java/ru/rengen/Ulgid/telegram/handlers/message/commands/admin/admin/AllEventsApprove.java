package ru.rengen.Ulgid.telegram.handlers.message.commands.admin.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.rengen.Ulgid.telegram.handlers.message.commands.admin.AdminCommandsList.AdminCommand;
import ru.rengen.Ulgid.telegram.logic.admin.AdminApproveAll;

@Component
public class AllEventsApprove extends AdminCommand {
    @Autowired
    private AllEventsApprove(AdminApproveAll logic) {
        this.logic = logic;
    }

    @Override
    public String getCommand() {
        return "/alleventsapprove";
    }

    @Override
    public String description() {
        return "Модерируются все/никто/не одобренные";
    }

    @Override
    public Integer level() {
        return 2;
    }
}
