package ru.rengen.Ulgid.telegram.handlers.message.commands;

import lombok.Getter;

import java.util.Map;

@Getter
public abstract class CommandList {
    protected Map<String, Command> commands;
    protected String role;
}
