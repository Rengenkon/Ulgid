package ru.rengen.Ulgid.telegram.handlers.message.commands.admin.trusted;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.rengen.Ulgid.telegram.handlers.message.commands.admin.AdminCommandsList.AdminCommand;
import ru.rengen.Ulgid.telegram.logic.admin.TrustedModeratorDelete;

@Component
public class DeleteModerator extends AdminCommand {
    @Autowired
    private DeleteModerator(TrustedModeratorDelete logic) {
        this.logic = logic;
    }

    @Override
    public String getCommand() {
        return "/removemederator";
    }

    @Override
    public String description() {
        return "Удаляет модератора";
    }

    @Override
    public Integer level() {
        return 1;
    }
}
