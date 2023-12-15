package ru.rengen.Ulgid.telegram.handlers.message.newA;

import lombok.Getter;

import java.util.List;

@Getter
public abstract class CommandList {
    List<Command> commands;

    public void register(Command command) {
        commands.add(command);
    }

    abstract public String getRole();

}
