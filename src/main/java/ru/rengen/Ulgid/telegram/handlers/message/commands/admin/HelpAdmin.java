package ru.rengen.Ulgid.telegram.handlers.message.commands.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.rengen.Ulgid.telegram.handlers.message.commands.BaseHelp;

import java.util.List;

@Component
public class HelpAdmin extends BaseHelp
        implements AdminCommand {
    @Autowired
    private HelpAdmin(List<AdminCommand> list) {
        commands = getCommands(list);
    }
}
