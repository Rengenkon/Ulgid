package ru.rengen.Ulgid.telegram.models;

import lombok.Getter;

@Getter
public class Event {
    private Long id;
    private Long companyID;
    private String name;
//    private Tags tags;
    private String tag;

    public Event(Long companyID, String name, String tag) {
        this.companyID = companyID;
        this.name = name;
        this.tag = tag;
    }
    public Event(Long id, Long companyID, String name, String tag) {
        this(companyID, name, tag);
        this.id = id;
    }

}
