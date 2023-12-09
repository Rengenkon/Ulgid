package ru.rengen.Ulgid.telegram.handlers.message.commands.company.company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.rengen.Ulgid.telegram.handlers.message.commands.company.CompanyCommandsList.CompanyCommand;
import ru.rengen.Ulgid.telegram.logic.company.EmployeeDelete;

@Component
public class DeleteEmployee extends CompanyCommand {
    @Autowired
    private DeleteEmployee(EmployeeDelete logic){
        this.logic = logic;
    }

    @Override
    public String getCommand() {
        return "/deleteemployee";
    }

    @Override
    public String description() {
        return "Удаляет человека из компании";
    }

    @Override
    public Integer level() {
        return 1;
    }
}
