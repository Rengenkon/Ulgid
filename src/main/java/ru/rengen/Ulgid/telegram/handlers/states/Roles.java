package ru.rengen.Ulgid.telegram.handlers.states;

public class Roles {
    public static final String USER = "USR";
    public static final String COMPANY = "USR";
    public static final String ADMIN = "USR";

    public int indDefaultRole() {
        return 0;
    }

    public String[] getRoles() {
        return new String[]{
                USER,
                COMPANY,
                ADMIN
        };
    }
}
