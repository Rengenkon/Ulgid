package ru.rengen.Ulgid.telegram.handlers.message.commands.company.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.rengen.Ulgid.telegram.handlers.message.commands.company.CompanyCommandsList.CompanyCommand;
import ru.rengen.Ulgid.telegram.logic.company.EventShow;

@Component
public class ShowEvents extends CompanyCommand {
    @Autowired
    private ShowEvents(EventShow logic){
        this.logic = logic;
    }

    @Override
    public String getCommand() {
        return "/show";
    }

    @Override
    public String description() {
        return "Показывает все ваши мероприятия";
    }
}
