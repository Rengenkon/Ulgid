package ru.rengen.Ulgid.telegram.handlers.states;

public class Admin implements Role {
    @Override
    public String getName() {
        return getState();
    }

    public static String getState() {
        return "AD";
    }
}
