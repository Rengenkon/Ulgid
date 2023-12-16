package ru.rengen.Ulgid.telegram.handlers.message.commands.user;

import ru.rengen.Ulgid.telegram.RoleStates;
import ru.rengen.Ulgid.telegram.handlers.message.commands.Command;

interface User extends Command {
    @Override
    default String getRole() {
        return RoleStates.USER;
    }
}
