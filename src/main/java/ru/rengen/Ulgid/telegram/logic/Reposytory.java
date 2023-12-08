package ru.rengen.Ulgid.telegram.logic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.rengen.Ulgid.telegram.models.accounts.Company;

import java.util.List;
import java.util.Map;

@Component
public class Reposytory {
    @Autowired
    List<Company> companyList;
    @Autowired
    Map<Long, Long> companyEploee;
}
