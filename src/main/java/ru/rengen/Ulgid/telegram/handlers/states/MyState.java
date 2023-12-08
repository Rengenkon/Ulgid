package ru.rengen.Ulgid.telegram.handlers.states;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class MyState {
    private static final int LENGTH = 2;
    private final String DEFAULT_STATE = User.getState();
    private Map<Long, String> states = new HashMap<>();

    public void setState(Long id, Role state) {
        states.put(id, state.getName());
    }

    public void addState(Long id, String state) {
        if (User.getState().length() != LENGTH) {
            throw new StateException();
        }
        states.put(id, states.get(id) + state);
    }

    public String getLastState(Long id) {
        String state = getState(id);
        return state.substring(state.length() - 1 - LENGTH);
    }

    public String getState(Long id) {
        String state = states.get(id);
        if (state == null) {
            state = DEFAULT_STATE;
            states.put(id, state);
        }
        return state.substring(state.length() - LENGTH);
    }

    public boolean isSimple(Long id) {
        return getState(id).length() == LENGTH;
    }

    public boolean isSimple(String state) {
        return state.length() == LENGTH;
    }


}
