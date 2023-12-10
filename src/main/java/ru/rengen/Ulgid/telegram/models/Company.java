package ru.rengen.Ulgid.telegram.models;

import lombok.Getter;
import ru.rengen.Ulgid.telegram.models.WorkTime;

@Getter
public class Company {
    private Long founderId;
    private String name;
    private String description;
    private WorkTime workTime;
    private String address;
//    String geo; геопозиция, лучше чем адрес
    private String phone;
    private String[] links;


    public Company(Long founderId, String name, String description){
        this.name = name;
        this.description = description;
        this.founderId = founderId;
    }
}
