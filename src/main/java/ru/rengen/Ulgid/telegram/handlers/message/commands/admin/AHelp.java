package ru.rengen.Ulgid.telegram.handlers.message.commands.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.rengen.Ulgid.telegram.handlers.message.commands.HelpAbstract;

import java.util.List;

@Component
class AHelp extends HelpAbstract implements Admin {
    @Autowired
    private AHelp(List<Admin> list){
        list.add(this);
        commands = getHelpText(list);
    }
}
