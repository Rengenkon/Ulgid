package ru.rengen.Ulgid.telegram.handlers.message.commands.company.company;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import ru.rengen.Ulgid.telegram.handlers.message.commands.company.CompanyCommand;
import ru.rengen.Ulgid.telegram.logic.Logic;
import ru.rengen.Ulgid.telegram.logic.company.CompanyCreate;

@Component
public class CreateCompany implements CompanyCommand {
    @Autowired
    private CompanyCreate create;

    @Override
    public Logic getLogic() {
        return create;
    }

    @Override
    public String getCommand() {
        return "/crete-company";
    }

    @Override
    public String description() {
        return "Создает новую компанию";
    }

    @Override
    public Integer level() {
        return -1;
    }

    @Override
    public SendMessage doSomethings(Message message) {
        return create.first(message.getChatId());
    }
}
