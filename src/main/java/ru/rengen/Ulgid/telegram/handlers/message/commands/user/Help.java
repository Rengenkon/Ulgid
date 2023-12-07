package ru.rengen.Ulgid.telegram.handlers.message.commands.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import ru.rengen.Ulgid.telegram.handlers.message.commands.BaseCommand;
import ru.rengen.Ulgid.telegram.handlers.message.commands.company.CompanyCommand;

import java.util.List;

@Component
public class Help extends ru.rengen.Ulgid.telegram.handlers.message.commands.Help
        implements UserCommand {
    @Autowired
    private Help(List<UserCommand> list) {
        commands = getCommands(list);
    }
}
