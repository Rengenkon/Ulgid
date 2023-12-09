package ru.rengen.Ulgid.telegram.handlers.message.commands;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import ru.rengen.Ulgid.telegram.logic.Logic;

public interface Command {
    String getCommand();
    String description(); // description of command for help
    default Integer level(){
        return 0;
    }
    Logic getLogic();
    SendMessage doSomethings(Message message);
}
