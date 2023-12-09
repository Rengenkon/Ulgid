package ru.rengen.Ulgid.validators.company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.rengen.Ulgid.telegram.models.accounts.Company;
import ru.rengen.Ulgid.telegram.models.repositorys.CompanyRepository;
import ru.rengen.Ulgid.validators.Question;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Component
public class Create {
    public interface CreateQuestion extends Question{}

    private Map<Integer, CreateQuestion> questions;
    private List<Integer> stateList;
    private CompanyRepository repository;

    @Autowired
    private Create(List<CreateQuestion> list, CompanyRepository rep) {
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

    public String getQuestion(String questionState) {
        return questions.get(Integer.parseInt(questionState)).getQuestion();
    }
    public String validateAnswer(String questionState, String answer) {
        return questions.get(Integer.parseInt(questionState)).validate(answer);
    }

    public String getFirstState(){
        return stateList.getFirst().toString();
    }

    public boolean isFinalState(String state) {
        return stateList.getLast().equals(Integer.parseInt(state));
    }

    public String getNextState(String state) {
        return stateList.get(
                stateList.indexOf(Integer.parseInt(state)) + 1)
                .toString();
    }
}
