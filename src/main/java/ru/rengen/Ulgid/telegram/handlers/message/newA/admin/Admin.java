package ru.rengen.Ulgid.telegram.handlers.message.newA.admin;

import ru.rengen.Ulgid.telegram.handlers.message.newA.Command;

interface Admin extends Command {
    @Override
    default String getRole() {
        return "Admin";
    }
}
