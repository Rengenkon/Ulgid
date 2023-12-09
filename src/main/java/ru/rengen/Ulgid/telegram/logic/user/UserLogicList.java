package ru.rengen.Ulgid.telegram.logic.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.rengen.Ulgid.telegram.handlers.states.Roles;
import ru.rengen.Ulgid.telegram.logic.Logic;
import ru.rengen.Ulgid.telegram.logic.LogicList;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class UserLogicList extends LogicList {
    static public abstract class UserLogic extends Logic {}
    @Autowired
    private UserLogicList(List<UserLogic> logics) {
        map = logics.stream().collect(Collectors.toMap(l -> Roles.USER, l -> l));
    }
}
