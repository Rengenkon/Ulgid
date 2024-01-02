package ru.rengen.ulgidtelegram.handlers.message.commands.company;

import ru.rengen.ulgidtelegram.RoleStates;
import ru.rengen.ulgidtelegram.handlers.message.commands.Command;

interface Company extends Command {
    @Override
    default String getRole() {
        return RoleStates.COMPANY;
    }
}
