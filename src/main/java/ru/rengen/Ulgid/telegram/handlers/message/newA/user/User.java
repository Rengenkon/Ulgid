package ru.rengen.Ulgid.telegram.handlers.message.newA.user;

import ru.rengen.Ulgid.telegram.handlers.message.newA.Command;

interface User extends Command {
    @Override
    default String getRole() {
        return "User";
    }
}
