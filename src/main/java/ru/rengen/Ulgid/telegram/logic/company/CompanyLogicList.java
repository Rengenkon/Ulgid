package ru.rengen.Ulgid.telegram.logic.company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.rengen.Ulgid.telegram.handlers.states.Roles;
import ru.rengen.Ulgid.telegram.logic.LogicList;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CompanyLogicList extends LogicList {
    @Autowired
    private CompanyLogicList(List<CompanyLogic> logics) {
        map = logics.stream().collect(Collectors.toMap(l -> Roles.COMPANY, l -> l));
    }
}
