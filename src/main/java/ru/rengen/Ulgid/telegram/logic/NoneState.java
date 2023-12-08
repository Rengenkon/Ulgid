package ru.rengen.Ulgid.telegram.logic;

import org.springframework.beans.factory.annotation.Autowired;
import ru.rengen.Ulgid.telegram.handlers.states.MyState;

public abstract class NoneState {
    @Autowired
    protected MyState states;
}
