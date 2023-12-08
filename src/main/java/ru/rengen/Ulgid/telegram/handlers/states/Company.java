package ru.rengen.Ulgid.telegram.handlers.states;

public class Company implements Role {
    @Override
    public String getName() {
        return getState();
    }

    public static String getState() {
        return "CM";
    }
}
