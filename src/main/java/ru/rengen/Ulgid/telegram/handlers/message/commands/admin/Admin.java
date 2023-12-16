package ru.rengen.Ulgid.telegram.handlers.message.commands.admin;

import ru.rengen.Ulgid.telegram.RoleStates;
import ru.rengen.Ulgid.telegram.handlers.message.commands.Command;

interface Admin extends Command {
    @Override
    default String getRole() {
        return RoleStates.ADMIN;
    }
}
