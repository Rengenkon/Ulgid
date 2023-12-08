package ru.rengen.Ulgid.telegram.handlers.message.commands.user.interfaces;

import org.springframework.beans.factory.annotation.Autowired;
import ru.rengen.Ulgid.telegram.logic.IntarfaceSwitcher;

public abstract class Interface {
    @Autowired
    protected IntarfaceSwitcher switcher;
}
