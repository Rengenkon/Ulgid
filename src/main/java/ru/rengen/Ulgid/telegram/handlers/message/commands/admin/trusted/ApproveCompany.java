package ru.rengen.Ulgid.telegram.handlers.message.commands.admin.trusted;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.rengen.Ulgid.telegram.handlers.message.commands.admin.AdminCommandsList.AdminCommand;
import ru.rengen.Ulgid.telegram.logic.admin.TrustedApproveCompany;

@Component
public class ApproveCompany extends AdminCommand {
    @Autowired
    private ApproveCompany(TrustedApproveCompany logic) {
        this.logic = logic;
    }

    @Override
    public String getCommand() {
        return "/approve-company";
    }

    @Override
    public String description() {
        return "Одобряет компанию";
    }

    @Override
    public Integer level() {
        return 1;
    }
}
