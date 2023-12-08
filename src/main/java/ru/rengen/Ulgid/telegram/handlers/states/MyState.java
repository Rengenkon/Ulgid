package ru.rengen.Ulgid.telegram.handlers.states;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class MyState {
    private final String[] DEFAULT_STATES;
    private final int DEFAULT_STATE;
    private final Map<Long, ArrayList<String>> states;

    @Autowired
    private MyState(Roles roles) {
        states = new HashMap<>();
        DEFAULT_STATES = roles.getRoles();
        DEFAULT_STATE = roles.indDefaultRole();
    }

    public void setState(Long id, String state) {
        var stateList = states.get(id);
        stateList.clear();;
        stateList.add(state);
    }

    public void addState(Long id, String state) {
        states.get(id).addLast(state);
    }

    public String getLastState(Long id) {
        return states.get(id).getLast();
    }

    public String getFirstState(Long id) {
        var stateList = states.get(id);
        if (stateList.isEmpty()){
            stateList.add(DEFAULT_STATES[DEFAULT_STATE]);
        }
        return stateList.getFirst();
    }

    public String removeLastState(Long id) {
        return states.get(id).removeLast();
    }

    public void removeState(Long id) {
        states.remove(id);
    }

    public boolean isDefault(String state) {
        for (String def : DEFAULT_STATES) {
            if (def.equals(state)) {
                return true;
            }
        }
        return false;
    }
    public Iterator<String> getAll(Long id) {
        return states.get(id).iterator();
    }
}
