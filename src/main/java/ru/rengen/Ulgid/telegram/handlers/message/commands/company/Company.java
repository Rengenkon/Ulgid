package ru.rengen.Ulgid.telegram.handlers.message.commands.company;

import ru.rengen.Ulgid.telegram.RoleStates;
import ru.rengen.Ulgid.telegram.handlers.message.commands.Command;

interface Company extends Command {
    @Override
    default String getRole() {
        return RoleStates.COMPANY;
    }
}
