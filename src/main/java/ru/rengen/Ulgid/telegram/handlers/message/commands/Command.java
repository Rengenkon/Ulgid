package ru.rengen.Ulgid.telegram.handlers.message.commands;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;

public interface Command {
    String getCommand();
    SendMessage doSomethings(Message message);
    String description(); // description of command for help
    default Integer level(){
        return 0;
    }
}
