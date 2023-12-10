package ru.rengen.Ulgid.validators.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.rengen.Ulgid.telegram.models.Event;
import ru.rengen.Ulgid.telegram.models.repositorys.EventRepository;

import java.util.List;

@Component
public class GetEvents {
    @Autowired
    private EventRepository repository;

    public List<Event> getEvents() {
        return repository.getEvents();
    }

}
