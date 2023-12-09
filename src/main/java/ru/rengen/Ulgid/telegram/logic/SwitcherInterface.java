package ru.rengen.Ulgid.telegram.logic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import ru.rengen.Ulgid.telegram.handlers.states.Roles;

import javax.management.relation.Role;

@Component
public class SwitcherInterface extends NoneState {// Переключает между ролями
    private Roles roles;

    @Autowired
    private SwitcherInterface(Roles roles) {
        this.roles = roles;
    }

    public void admin(Long id) {
        states.setState(id, roles.getADMIN());
    }

    public void company(Long id) {
        states.setState(id, roles.getCOMPANY());
    }

    public void user(Long id) {
        states.setState(id, roles.getUSER());
    }
}
