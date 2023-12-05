package ru.rengen.Ulgid.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import org.springframework.data.annotation.Id;

@Entity
public abstract class Event {
    @Id// в чем отличие от jakarta
    @GeneratedValue
    private Long id;// UUID
    @Column(nullable = false)
    private String name;
}
