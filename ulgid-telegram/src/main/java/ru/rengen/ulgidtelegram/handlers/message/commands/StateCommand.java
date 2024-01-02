package ru.rengen.ulgidtelegram.handlers.message.commands;

import lombok.Getter;
import org.telegram.telegrambots.bots.DefaultAbsSender;
import org.telegram.telegrambots.meta.api.objects.Message;
import ru.rengen.ulgidtelegram.logic.Logic;

@Getter
public abstract class StateCommand implements Command{
    protected Logic logic;

    @Override
    public void exe(DefaultAbsSender bot, Message message) {
        logic.firstCall(bot, message);
    }
}
