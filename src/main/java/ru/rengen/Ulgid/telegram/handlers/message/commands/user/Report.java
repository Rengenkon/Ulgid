package ru.rengen.Ulgid.telegram.handlers.message.commands.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.rengen.Ulgid.telegram.handlers.message.commands.user.UserCommandsList.UserCommand;
import ru.rengen.Ulgid.telegram.logic.user.ReportEvent;

@Component
public class Report extends UserCommand {
    @Autowired
    private Report(ReportEvent logic) {
        this.logic = logic;
    }

    @Override
    public String getCommand() {
        return "/report";
    }

    @Override
    public String description() {
        return "Позваляет пожаловать на мероприятие или компанию";
    }
}
