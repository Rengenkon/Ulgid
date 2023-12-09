package ru.rengen.Ulgid.telegram.logic;

import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import ru.rengen.Ulgid.telegram.handlers.states.Roles;

@Component
public class SwitcherInterface extends NoneState {// Переключает между ролями
    public void admin(Long id) {
        states.setState(id, Roles.ADMIN);
    }

    public void company(Long id) {
        states.setState(id, Roles.COMPANY);
    }

    public void user(Long id) {
        states.setState(id, Roles.USER);
    }
}
