package ru.rengen.Ulgid.telegram.handlers.message.commands.admin.trusted;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.rengen.Ulgid.telegram.handlers.message.commands.admin.AdminCommandsList.AdminCommand;
import ru.rengen.Ulgid.telegram.logic.admin.TrustedModeratorAdd;

@Component
public class AddModerator extends AdminCommand {
    @Autowired
    private AddModerator(TrustedModeratorAdd logic) {
        this.logic = logic;
    }

    @Override
    public String getCommand() {
        return "/addmederator";
    }

    @Override
    public String description() {
        return "Создает код, который должен ввести новый модератор";
    }

    @Override
    public Integer level() {
        return 1;
    }
}
