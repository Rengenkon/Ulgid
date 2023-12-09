package ru.rengen.Ulgid.telegram.handlers.message.commands.admin.trusted;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.rengen.Ulgid.telegram.handlers.message.commands.admin.AdminCommandsList.AdminCommand;
import ru.rengen.Ulgid.telegram.logic.admin.TrustedBanCompany;

@Component
public class Ban extends AdminCommand {
    @Autowired
    private Ban(TrustedBanCompany logic) {
        this.logic = logic;
    }

    @Override
    public String getCommand() {
        return "/ban";
    }

    @Override
    public String description() {
        return "Банит компанию";
    }

    @Override
    public Integer level() {
        return 1;
    }
}
