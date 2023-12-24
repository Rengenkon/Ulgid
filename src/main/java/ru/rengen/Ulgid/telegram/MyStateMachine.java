package ru.rengen.Ulgid.telegram;

import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class MyStateMachine {
    private final Map<Long, ArrayList<String>> states = new HashMap<>();
    private final static String DEFAULT= RoleStates.USER;

    public void setState(Long id, String state) {
        var stateList = states.get(id);
        stateList.clear();;
        stateList.add(state);
    }

    public void addState(Long id, String state) {
//        states.get(id).addLast(state);
    }

    public String getFirstState(Long id) {
        var stateList = states.get(id);
        if (stateList == null) {
            stateList = new ArrayList<>();
            stateList.add(DEFAULT);
            states.put(id, stateList);
        }
//        return stateList.getFirst();
        return null;
    }

    public String removeLastState(Long id) {
        return null;
//        return states.get(id).removeLast();
    }

    public void removeState(Long id) {
        states.remove(id);
    }

    public boolean isDefault(Long id) {
        return states.get(id).size() == 1;
    }

    public Iterator<String> getAll(Long id) {
        return states.get(id).iterator();
    }
}
