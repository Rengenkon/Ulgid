package ru.rengen.Ulgid.telegram.handlers.states.mappers;

import org.springframework.beans.factory.annotation.Autowired;
import ru.rengen.Ulgid.telegram.handlers.message.commands.company.CompanyCommandsList;
import ru.rengen.Ulgid.telegram.handlers.states.Roles;

import java.util.Iterator;

public class UserMapper extends StateMapper {
    @Autowired
    private UserMapper(CompanyCommandsList list) {
        setStateLogic(list);
    }

    @Override
    public String getRole() {
        return Roles.USER;
    }
}
