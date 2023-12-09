package ru.rengen.Ulgid.telegram.handlers.message.commands.company.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.rengen.Ulgid.telegram.handlers.message.commands.company.CompanyCommandsList.CompanyCommand;
import ru.rengen.Ulgid.telegram.logic.company.EventCreate;

@Component
public class CreateEvent extends CompanyCommand {
    @Autowired
    private CreateEvent(EventCreate logic){
        this.logic = logic;
    }

    @Override
    public String getCommand() {
        return "/add";
    }

    @Override
    public String description() {
        return "Создает новое мероприятие";
    }
}
