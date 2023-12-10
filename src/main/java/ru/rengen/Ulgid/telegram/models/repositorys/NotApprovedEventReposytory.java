package ru.rengen.Ulgid.telegram.models.repositorys;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class NotApprovedEventReposytory {
    List<Long> list = new ArrayList<>();

    public void add(Long id) {
        list.add(id);
    }

    public boolean contains(Long id) {
        return list.contains(id);
    }

    public void remove(Long id) {
        list.remove(id);
    }
}
