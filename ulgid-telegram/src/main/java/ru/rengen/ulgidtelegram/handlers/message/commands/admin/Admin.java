package ru.rengen.ulgidtelegram.handlers.message.commands.admin;

import ru.rengen.ulgidtelegram.RoleStates;
import ru.rengen.ulgidtelegram.handlers.message.commands.Command;

interface Admin extends Command {
    @Override
    default String getRole() {
        return RoleStates.ADMIN;
    }
}
