package ru.rengen.Ulgid.telegram.handlers.message.commands.admin.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.rengen.Ulgid.telegram.handlers.message.commands.admin.AdminCommandsList.AdminCommand;
import ru.rengen.Ulgid.telegram.logic.admin.AdminTrustedAdd;

@Component
public class AddTrusted extends AdminCommand {
    @Autowired
    private AddTrusted(AdminTrustedAdd logic) {
        this.logic = logic;
    }

    @Override
    public String getCommand() {
        return "/addtrusted";
    }

    @Override
    public String description() {
        return "Генерирует код для админа доверенного уровня";
    }

    @Override
    public Integer level() {
        return 2;
    }
}
