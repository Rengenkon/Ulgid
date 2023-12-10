package ru.rengen.Ulgid.telegram.handlers.message.commands.user.interfaces;

import org.springframework.beans.factory.annotation.Autowired;
import ru.rengen.Ulgid.telegram.handlers.message.commands.user.UserCommandsList.UserCommand;
import ru.rengen.Ulgid.telegram.logic.SwitcherInterface;

public abstract class Interface extends UserCommand {
    @Autowired
    protected SwitcherInterface switcher;

}
