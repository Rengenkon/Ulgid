package ru.rengen.Ulgid.telegram.models.repositorys;

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
        for (Company company : list) {
            if (company.getFounderId().equals(id)) {
                return company;
            }
        }
        return null;
    }

    public void add(Company company) {
        list.add(company);
        var id = company.getFounderId();
        employeesRepository.add(id, id);
    }
}
