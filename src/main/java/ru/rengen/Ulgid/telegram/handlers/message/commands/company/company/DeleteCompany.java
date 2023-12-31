package ru.rengen.Ulgid.telegram.handlers.message.commands.company.company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.rengen.Ulgid.telegram.handlers.message.commands.company.CompanyCommandsList.CompanyCommand;
import ru.rengen.Ulgid.telegram.logic.company.CompanyDelete;

@Component
public class DeleteCompany extends CompanyCommand {
    @Autowired
    private DeleteCompany(CompanyDelete logic){
        this.logic = logic;
    }

    @Override
    public String getCommand() {
        return "/deletecompany";
    }

    @Override
    public String description() {
        return "Удаляет компанию";
    }

    @Override
    public Integer level() {
        return 1;
    }
}
