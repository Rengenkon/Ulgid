package ru.rengen.Ulgid.validators.company;

import org.springframework.beans.factory.annotation.Autowired;
import ru.rengen.Ulgid.telegram.models.repositorys.EventRepository;
import ru.rengen.Ulgid.validators.Valid;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CreateaaaaaaaaaaaaaaValis extends Valid {
    public interface CreateEventQuestion extends Question {}

    private EventRepository repository;

    @Autowired
    private CreateaaaaaaaaaaaaaaValis(List<CreateEventQuestion> list, EventRepository rep) {
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


}
