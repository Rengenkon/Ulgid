package ru.rengen.Ulgid.telegram.handlers.message.commands;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import ru.rengen.Ulgid.telegram.logic.Logic;
import ru.rengen.Ulgid.telegram.logic.NoneLogic;

public abstract class Command {
    protected Logic logic;
    abstract public String getCommand();
    abstract public String description(); // description of command for help
    public Integer level(){
        return 0;
    }
    public Logic getLogic() {
        return logic;
    }
    public SendMessage doSomethings(Message message) {
        return logic.firstCall(message.getChatId());
    }
}
