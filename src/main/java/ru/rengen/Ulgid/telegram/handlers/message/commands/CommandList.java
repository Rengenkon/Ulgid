package ru.rengen.Ulgid.telegram.handlers.message.commands;

import lombok.Getter;
import ru.rengen.Ulgid.telegram.handlers.roles.Role;

import java.util.Map;

@Getter
public abstract class CommandList {
    protected Role role;
    protected Map<String, Command> commands;
}
