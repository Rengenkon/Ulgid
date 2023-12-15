package ru.rengen.Ulgid.telegram.handlers.message.newA.company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.rengen.Ulgid.telegram.handlers.message.newA.HelpAbstract;

import java.util.List;

@Component
class Help extends HelpAbstract implements Company {
    @Autowired
    private Help(List<Company> list){
        list.add(this);
        commands = getHelpText(list);
    }
}
