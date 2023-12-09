package ru.rengen.Ulgid.telegram.handlers.message.commands.company.company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.rengen.Ulgid.telegram.handlers.message.commands.company.CompanyCommandsList.CompanyCommand;
import ru.rengen.Ulgid.telegram.logic.company.CompanySelect;

@Component
public class SelectCompany extends CompanyCommand {
    @Autowired
    private SelectCompany(CompanySelect logic){
        this.logic = logic;
    }

    @Override
    public String getCommand() {
        return "/select";
    }

    @Override
    public String description() {
        return "Позволяет выбрать копанию";
    }
}
