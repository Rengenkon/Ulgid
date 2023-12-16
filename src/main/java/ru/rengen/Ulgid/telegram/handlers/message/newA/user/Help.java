package ru.rengen.Ulgid.telegram.handlers.message.newA.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.rengen.Ulgid.telegram.handlers.message.newA.HelpAbstract;

import java.util.List;

@Component
class Help extends HelpAbstract implements User {
    @Autowired
    private Help(List<User> list){
        list.add(this);
        commands = getHelpText(list);
    }
}
