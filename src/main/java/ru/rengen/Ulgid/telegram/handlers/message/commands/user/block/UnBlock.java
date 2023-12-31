package ru.rengen.Ulgid.telegram.handlers.message.commands.user.block;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.rengen.Ulgid.telegram.handlers.message.commands.user.UserCommandsList.UserCommand;
import ru.rengen.Ulgid.telegram.logic.user.BlockUnblock;

@Component
public class UnBlock extends UserCommand  {
    @Autowired
    private UnBlock(BlockUnblock logic) {
        this.logic = logic;
    }

    @Override
    public String getCommand() {
        return "/unblock";
    }

    @Override
    public String description() {
        return "Позволяет раблокировать компанию";
    }
}
