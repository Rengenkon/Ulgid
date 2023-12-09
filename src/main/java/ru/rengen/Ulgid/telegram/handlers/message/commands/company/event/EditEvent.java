package ru.rengen.Ulgid.telegram.handlers.message.commands.company.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.rengen.Ulgid.telegram.handlers.message.commands.company.CompanyCommandsList.CompanyCommand;
import ru.rengen.Ulgid.telegram.logic.company.EventEdit;

@Component
public class EditEvent extends CompanyCommand {
    @Autowired
    private EditEvent(EventEdit logic){
        this.logic = logic;
    }

    @Override
    public String getCommand() {
        return "/edit-event";
    }

    @Override
    public String description() {
        return "Позволяет изменить мероприятие";
    }
}
