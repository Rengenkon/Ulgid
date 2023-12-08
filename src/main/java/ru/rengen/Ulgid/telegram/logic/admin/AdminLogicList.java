package ru.rengen.Ulgid.telegram.logic.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.rengen.Ulgid.telegram.handlers.states.Roles;
import ru.rengen.Ulgid.telegram.logic.LogicList;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class AdminLogicList extends LogicList {
    @Autowired
    private AdminLogicList(List<AdminLogic> logics) {
        map = logics.stream().collect(Collectors.toMap(l -> Roles.COMPANY, l -> l));
    }
}
