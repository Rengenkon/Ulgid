package ru.rengen.Ulgid.telegram.handlers.states.mappers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.rengen.Ulgid.telegram.handlers.message.commands.company.CompanyCommandsList;
import ru.rengen.Ulgid.telegram.handlers.message.commands.user.UserCommandsList;
import ru.rengen.Ulgid.telegram.handlers.states.Roles;

import java.util.Iterator;

//@Component
public class UserMapper extends StateMapper {
    @Autowired
    private UserMapper(UserCommandsList list, Roles roles) {
        role = roles.getUSER();
        setStateLogic(list);
    }
}
