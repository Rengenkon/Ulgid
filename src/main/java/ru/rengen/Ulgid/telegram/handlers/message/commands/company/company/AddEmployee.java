package ru.rengen.Ulgid.telegram.handlers.message.commands.company.company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.rengen.Ulgid.telegram.handlers.message.commands.company.CompanyCommandsList.CompanyCommand;
import ru.rengen.Ulgid.telegram.logic.company.EmployeeAdd;

@Component
class AddEmployee extends CompanyCommand {
    @Autowired
    private AddEmployee(EmployeeAdd logic){
        this.logic = logic;
    }

    @Override
    public String getCommand() {
        return "/addemployee";
    }

    @Override
    public String description() {
        return "Добавляет человека в компанию";
    }

    @Override
    public Integer level() {
        return 1;
    }
}
