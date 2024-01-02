package ru.rengen.ulgidtelegram.handlers.message.commands.company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.rengen.ulgidtelegram.handlers.message.commands.HelpAbstract;

import java.util.List;

@Component
class CHelp extends HelpAbstract implements Company {
    @Autowired
    private CHelp(List<Company> list){
        list.add(this);
        commands = getHelpText(list);
    }
}
