package ru.rengen.Ulgid.telegram.handlers.message.commands.company.company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.rengen.Ulgid.telegram.handlers.message.commands.company.CompanyCommandsList.CompanyCommand;
import ru.rengen.Ulgid.telegram.logic.company.CompanyCreate;

@Component
class CreateCompany extends CompanyCommand {
    @Autowired
    private CreateCompany(CompanyCreate logic){
        this.logic = logic;
    }


    @Override
    public String getCommand() {
        return "/cretecompany";
    }

    @Override
    public String description() {
        return "Создает новую компанию";
    }

    @Override
    public Integer level() {
        return -1;
    }
}
