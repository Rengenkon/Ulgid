package ru.rengen.Ulgid.telegram.handlers.message.commands.company.company;

import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import ru.rengen.Ulgid.telegram.handlers.message.commands.company.CompanyCommand;

@Component
public class DeleteEmployee implements CompanyCommand {
    @Override
    public String getCommand() {
        return "/delete-employee";
    }

    @Override
    public String description() {
        return "Удаляет человека из компании";
    }

    @Override
    public Integer level() {
        return 1;
    }

    @Override
    public SendMessage doSomethings(Message message) {
        return null;
    }
}
