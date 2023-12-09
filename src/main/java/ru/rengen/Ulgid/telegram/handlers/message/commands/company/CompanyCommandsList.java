package ru.rengen.Ulgid.telegram.handlers.message.commands.company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.rengen.Ulgid.telegram.handlers.message.commands.Command;
import ru.rengen.Ulgid.telegram.handlers.message.commands.CommandList;
import ru.rengen.Ulgid.telegram.handlers.states.Roles;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CompanyCommandsList extends CommandList {
    public interface CompanyCommand extends Command {}
    @Autowired
    private CompanyCommandsList(List<CompanyCommand> commands) {
        role = Roles.COMPANY;
        this.commands = commands.stream().collect(Collectors.toMap(Command::getCommand, command -> command));
    }
}
