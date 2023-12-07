package ru.rengen.Ulgid.telegram.handlers.message.commands;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;

public abstract class Command {
    abstract public String getCommand();
    abstract public SendMessage doSomethings(Message message);
    abstract public String description(); // description of command for help
    protected Boolean hidden(){
        return false;
    }
}
