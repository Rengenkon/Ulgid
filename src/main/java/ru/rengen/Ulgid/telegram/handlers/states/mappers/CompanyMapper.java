package ru.rengen.Ulgid.telegram.handlers.states.mappers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.rengen.Ulgid.telegram.handlers.message.commands.company.CompanyCommandsList;
import ru.rengen.Ulgid.telegram.handlers.states.Roles;

@Component
class CompanyMapper extends StateMapper {
    @Autowired
    private CompanyMapper(CompanyCommandsList list) {
        setStateLogic(list);
    }

    @Override
    public String getRole() {
        return Roles.COMPANY;
    }
}
