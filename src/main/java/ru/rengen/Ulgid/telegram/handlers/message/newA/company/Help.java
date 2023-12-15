package ru.rengen.Ulgid.telegram.handlers.message.newA.company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.rengen.Ulgid.telegram.handlers.message.newA.HelpAbstract;

@Component
public class Help extends HelpAbstract {
    @Autowired
    private Help(CompanyCommandList list){
        list.register(this);
        // Нет гарантии, что все команды уже инициализировались и зарегестрировались, чтобы брать их из листа
        commands = getHelpText()
    }
}
