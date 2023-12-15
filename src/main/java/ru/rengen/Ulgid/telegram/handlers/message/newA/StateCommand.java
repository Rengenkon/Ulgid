package ru.rengen.Ulgid.telegram.handlers.message.newA;

import lombok.Getter;
import org.telegram.telegrambots.bots.DefaultAbsSender;
import org.telegram.telegrambots.meta.api.objects.Message;
import ru.rengen.Ulgid.telegram.logic.Logic;

@Getter
public abstract class StateCommand implements Command{
    Logic logic;

    @Override
    public void exe(DefaultAbsSender bot, Message message) {
        logic.firstCall(bot, message);
    }
}
