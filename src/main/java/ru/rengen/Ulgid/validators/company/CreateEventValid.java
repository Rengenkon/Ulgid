package ru.rengen.Ulgid.validators.company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.rengen.Ulgid.telegram.models.Event;
import ru.rengen.Ulgid.telegram.models.repositorys.EventRepository;
import ru.rengen.Ulgid.validators.Valid;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Component
public class CreateEventValid extends Valid {
    public interface CreateEventQuestion extends Question {}

    private EventRepository repository;
    private Long id = 0L;

    @Autowired
    private CreateEventValid(List<CreateEventQuestion> list, EventRepository rep) {
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

    public void createEvent(Long companyID, String name, String tag) {
        repository.add(new Event(id, companyID, name, tag));
        id++;
    }

}
