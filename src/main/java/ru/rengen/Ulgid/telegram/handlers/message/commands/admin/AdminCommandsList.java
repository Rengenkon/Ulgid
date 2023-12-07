package ru.rengen.Ulgid.telegram.handlers.message.commands.admin;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.rengen.Ulgid.telegram.handlers.message.commands.Command;
import ru.rengen.Ulgid.telegram.handlers.message.commands.CommandList;
import ru.rengen.Ulgid.telegram.handlers.roles.Admin;

import java.util.List;
import java.util.stream.Collectors;

@Component
@Getter
public class AdminCommandsList extends CommandList {
    @Autowired
    private AdminCommandsList(List<AdminCommand> commands) {
        role = new Admin();
        this.commands = commands.stream().collect(Collectors.toMap(Command::getCommand, command -> command));
    }
}
