package ru.rengen.Ulgid.telegram.handlers.message.commands.company.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.rengen.Ulgid.telegram.handlers.message.commands.company.CompanyCommandsList.CompanyCommand;
import ru.rengen.Ulgid.telegram.logic.company.EventDelete;

@Component
public class DeleteEvent extends CompanyCommand {
    @Autowired
    private DeleteEvent(EventDelete logic){
        this.logic = logic;
    }

    @Override
    public String getCommand() {
        return "/delete-event";
    }

    @Override
    public String description() {
        return "Удаляет мероприятие";
    }
}
