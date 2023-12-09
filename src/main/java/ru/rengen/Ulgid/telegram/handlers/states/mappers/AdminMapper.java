package ru.rengen.Ulgid.telegram.handlers.states.mappers;

import org.springframework.beans.factory.annotation.Autowired;
import ru.rengen.Ulgid.telegram.handlers.message.commands.user.UserCommandsList;
import ru.rengen.Ulgid.telegram.handlers.states.Roles;

public class AdminMapper extends StateMapper {
    @Autowired
    private AdminMapper(UserCommandsList list) {
        setStateLogic(list);
    }

    @Override
    public String getRole() {
        return Roles.ADMIN;
    }
}
