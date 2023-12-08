package ru.rengen.Ulgid.telegram.handlers.message.commands.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.rengen.Ulgid.telegram.handlers.message.commands.Command;
import ru.rengen.Ulgid.telegram.handlers.message.commands.CommandList;
import ru.rengen.Ulgid.telegram.handlers.states.User;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class UserCommandsList extends CommandList {
    @Autowired
    private UserCommandsList(List<UserCommand> commands) {
        role = new User();
        this.commands = commands.stream().collect(Collectors.toMap(Command::getCommand, command -> command));
    }
}
