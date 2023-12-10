package ru.rengen.Ulgid.telegram.models.repositorys;

import org.springframework.stereotype.Component;
import ru.rengen.Ulgid.telegram.models.Event;

import java.util.ArrayList;
import java.util.List;

@Component
public class EventRepository {
    private List<Event> list = new ArrayList<>();

    public void add(Event event) {
        list.add(event);
    }

    public Event getEvent(Long event) {
        for (Event e : list) {
            if (e.getId().equals(event)){
                return e;
            }
        }
        return null;
    }

    public List<Event> getEventsCompany(Long company) {
        List<Event> com = null;
        for (Event e : list) {
            if (e.getId().equals(company)){
                if (com == null) {
                    com = new ArrayList<>();
                }
                com.add(e);
            }
        }
        return com;

    }
}
