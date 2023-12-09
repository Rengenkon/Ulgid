package ru.rengen.Ulgid.telegram.handlers.states.mappers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.rengen.Ulgid.telegram.handlers.message.commands.admin.AdminCommandsList;
import ru.rengen.Ulgid.telegram.handlers.message.commands.user.UserCommandsList;
import ru.rengen.Ulgid.telegram.handlers.states.Roles;

//@Component
public class AdminMapper extends StateMapper {
    @Autowired
    private AdminMapper(AdminCommandsList list, Roles roles) {
        role = roles.getADMIN();
        setStateLogic(list);
    }
}
