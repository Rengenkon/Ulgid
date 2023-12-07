package ru.rengen.Ulgid.telegram.handlers.message.commands.company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.rengen.Ulgid.telegram.handlers.message.commands.BaseHelp;

import java.util.List;

@Component
public class Help extends BaseHelp
                    implements CompanyCommand{
    @Autowired
    private Help(List<CompanyCommand> list) {
        commands = getCommands(list);
    }
}
