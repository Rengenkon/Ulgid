package ru.rengen.Ulgid.telegram.handlers.message.newA.company;

import ru.rengen.Ulgid.telegram.handlers.message.newA.Command;

interface Company extends Command {
    @Override
    default String getRole() {
        return "Company";
    }
}
