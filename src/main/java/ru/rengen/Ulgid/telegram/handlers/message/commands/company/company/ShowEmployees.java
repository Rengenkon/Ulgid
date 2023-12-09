package ru.rengen.Ulgid.telegram.handlers.message.commands.company.company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.rengen.Ulgid.telegram.handlers.message.commands.company.CompanyCommandsList.CompanyCommand;
import ru.rengen.Ulgid.telegram.logic.company.EmployeeShow;

@Component
public class ShowEmployees extends CompanyCommand {
    @Autowired
    private ShowEmployees(EmployeeShow logic){
        this.logic = logic;
    }

    @Override
    public String getCommand() {
        return "/show-employee";
    }

    @Override
    public String description() {
        return "Показывает список сотрудников";
    }

    @Override
    public Integer level() {
        return 1;
    }
}
