package ru.rengen.Ulgid.telegram.handlers.message.commands.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.rengen.Ulgid.telegram.handlers.message.commands.HelpAbstract;

import java.util.List;

@Component
class UHelp extends HelpAbstract implements User {
    @Autowired
    private UHelp(List<User> list){
        list.add(this);
        commands = getHelpText(list);
    }
}
