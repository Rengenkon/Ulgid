package ru.rengen.Ulgid.telegram.handlers.message.commands.company.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.rengen.Ulgid.telegram.handlers.message.commands.company.CompanyCommandsList.CompanyCommand;
import ru.rengen.Ulgid.telegram.logic.company.EventShowUsers;

@Component
public class ShowSingUpedUser extends CompanyCommand {
    @Autowired
    private ShowSingUpedUser(EventShowUsers logic){
        this.logic = logic;
    }

    @Override
    public String getCommand() {
        return "/sing-ups";
    }

    @Override
    public String description() {
        return "Показывает записавшихся на мероприятие";
    }
}
