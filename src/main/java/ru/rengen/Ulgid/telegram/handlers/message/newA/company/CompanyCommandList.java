package ru.rengen.Ulgid.telegram.handlers.message.newA.company;

import org.springframework.stereotype.Component;
import ru.rengen.Ulgid.telegram.handlers.message.newA.CommandList;

@Component
class CompanyCommandList extends CommandList {
    @Override
    public String getRole() {
        return "Com";
    }
}
