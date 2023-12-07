package ru.rengen.Ulgid.telegram.handlers.message.commands.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.rengen.Ulgid.telegram.handlers.message.commands.BaseHelp;

import java.util.List;

@Component
public class HelpUser extends BaseHelp
        implements UserCommand {
    @Autowired
    private HelpUser(List<UserCommand> list) {
        commands = getCommands(list);
    }
}
