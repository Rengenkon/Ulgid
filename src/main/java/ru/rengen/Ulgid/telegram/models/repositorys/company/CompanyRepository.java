package ru.rengen.Ulgid.telegram.models.repositorys.company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.rengen.Ulgid.telegram.models.accounts.Company;

import java.util.ArrayList;
import java.util.List;

@Component
public class CompanyRepository {
    private List<Company> list;
    private EmployeesRepository employeesRepository;

    @Autowired
    private CompanyRepository(EmployeesRepository employeesRepository) {
        this.employeesRepository = employeesRepository;
        list = new ArrayList<>();
    }

    public Company getCompany(Long id) {
        return null;
    }

    public void add(Company company) {
        list.add(company);
        employeesRepository.add(company.getID(), company.getID());
    }
}
