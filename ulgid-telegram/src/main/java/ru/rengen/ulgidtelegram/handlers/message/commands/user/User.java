package ru.rengen.ulgidtelegram.handlers.message.commands.user;

import ru.rengen.ulgidtelegram.RoleStates;
import ru.rengen.ulgidtelegram.handlers.message.commands.Command;

interface User extends Command {
    @Override
    default String getRole() {
        return RoleStates.USER;
    }
}
