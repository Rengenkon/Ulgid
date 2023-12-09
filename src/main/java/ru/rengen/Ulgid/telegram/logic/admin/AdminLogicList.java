package ru.rengen.Ulgid.telegram.logic.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.rengen.Ulgid.telegram.handlers.states.Roles;
import ru.rengen.Ulgid.telegram.logic.Logic;
import ru.rengen.Ulgid.telegram.logic.LogicList;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class AdminLogicList extends LogicList {
    static public abstract class AdminLogic extends Logic {}
    @Autowired
    private AdminLogicList(List<AdminLogic> logics) {
        map = logics.stream().collect(Collectors.toMap(
                Logic::myState,
                l -> l));
    }
}
