package ru.rengen.Ulgid.telegram.handlers.message.newA.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.rengen.Ulgid.telegram.handlers.message.newA.HelpAbstract;

import java.util.List;

@Component
class Help extends HelpAbstract implements Admin {
    @Autowired
    private Help(List<Admin> list){
        list.add(this);
        commands = getHelpText(list);
    }
}
