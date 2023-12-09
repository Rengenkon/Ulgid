package ru.rengen.Ulgid.telegram.handlers.states;

import lombok.Getter;
import org.springframework.stereotype.Component;

@Component
@Getter
public class Roles {
//    public static final String USER = "USR";
//    public static final String COMPANY = "CMP";
//    public static final String ADMIN = "ADM";
    private final String USER = "USR";
    private final String COMPANY = "CMP";
    private final String ADMIN = "ADM";

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
