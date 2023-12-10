package ru.rengen.Ulgid.validators.company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.rengen.Ulgid.telegram.models.Company;
import ru.rengen.Ulgid.telegram.models.repositorys.CompanyRepository;
import ru.rengen.Ulgid.validators.Valid;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


@Component
public class CreateCompanyValid extends Valid {
    public interface CreateComQuestion extends Question{}

    private CompanyRepository repository;

    @Autowired
    private CreateCompanyValid(List<CreateComQuestion> list, CompanyRepository rep) {
        questions = new HashMap<>();
        stateList = new ArrayList<>();
        for (var question : list) {
            var key = question.getNumber();
            if (questions.containsKey(key)) {
                throw new RuntimeException("Duplicated question number\n"
                        + question.getClass().getName() + " and "
                        + questions.get(key).getClass().getName());
            }
            questions.put(key, question);
            stateList.add(key);
        }
        stateList.sort((a, b) -> {
            return a - b;
        });
        this.repository = rep;
    }

    public boolean exist(Long Id) {
        return repository.getCompany(Id) != null;
    }

    public void createCompany(Long id, String name, String description) {
        repository.add(new Company(id, name, description));
    }
}
