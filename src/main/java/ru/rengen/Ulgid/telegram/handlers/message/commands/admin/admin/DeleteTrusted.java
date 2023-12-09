package ru.rengen.Ulgid.telegram.handlers.message.commands.admin.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.rengen.Ulgid.telegram.handlers.message.commands.admin.AdminCommandsList.AdminCommand;
import ru.rengen.Ulgid.telegram.logic.admin.AdminTrustedDelete;

@Component
public class DeleteTrusted extends AdminCommand {
    @Autowired
    private DeleteTrusted(AdminTrustedDelete logic) {
        this.logic = logic;
    }

    @Override
    public String getCommand() {
        return "/deletetrusted";
    }

    @Override
    public String description() {
        return "Удаляет доверенного админа";
    }

    @Override
    public Integer level() {
        return 2;
    }
}
