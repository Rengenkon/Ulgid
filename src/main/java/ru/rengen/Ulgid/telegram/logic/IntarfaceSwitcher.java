package ru.rengen.Ulgid.telegram.logic;

import org.springframework.stereotype.Component;
import ru.rengen.Ulgid.telegram.handlers.states.Admin;
import ru.rengen.Ulgid.telegram.handlers.states.Company;
import ru.rengen.Ulgid.telegram.handlers.states.User;

@Component
public class IntarfaceSwitcher extends Logic {
    private Admin admin = new Admin();
    private Company company = new Company();
    private User user = new User();

    public void admin(Long id) {
        states.setState(id, admin);
    }

    public void company(Long id) {
        states.setState(id, company);
    }

    public void user(Long id) {
        states.setState(id, user);
    }
}
