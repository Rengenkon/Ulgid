package ru.rengen.Ulgid.telegram.handlers.message.commands.company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Help extends ru.rengen.Ulgid.telegram.handlers.message.commands.Help
                    implements CompanyCommand{
    @Autowired
    private Help(List<CompanyCommand> list) {
        commands = getCommands(list);
    }
}
