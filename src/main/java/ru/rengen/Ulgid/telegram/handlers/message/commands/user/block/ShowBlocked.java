package ru.rengen.Ulgid.telegram.handlers.message.commands.user.block;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.rengen.Ulgid.telegram.handlers.message.commands.user.UserCommandsList.UserCommand;
import ru.rengen.Ulgid.telegram.logic.user.BlockedShow;

@Component
public class ShowBlocked extends UserCommand {
    @Autowired
    private ShowBlocked(BlockedShow logic) {
        this.logic = logic;
    }

    @Override
    public String getCommand() {
        return "/showblocked";
    }

    @Override
    public String description() {
        return "Показывает список заблокированных компаний";
    }
}
