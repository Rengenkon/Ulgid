package ru.rengen.Ulgid.telegram.handlers.message.commands.user.block;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.rengen.Ulgid.telegram.handlers.message.commands.user.UserCommandsList.UserCommand;
import ru.rengen.Ulgid.telegram.logic.user.BlockCompany;

@Component
public class Block extends UserCommand {
    @Autowired
    private Block(BlockCompany logic) {
        this.logic = logic;
    }

    @Override
    public String getCommand() {
        return "/block";
    }

    @Override
    public String description() {
        return "Позволяет заблокировать компанию. Заблокированная компания не показывается";
    }
}
