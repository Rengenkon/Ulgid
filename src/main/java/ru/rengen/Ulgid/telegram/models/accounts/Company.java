package ru.rengen.Ulgid.telegram.models.accounts;

import ru.rengen.Ulgid.telegram.models.WorkTime;

public class Company extends AccountTelegram{
    /*
    Команда в отдельной таблице М-М
    Таблица одобренных компаний
     */
    Long ID;
    Long founderId;
    String name;
    String description;
    WorkTime workTime;
    String address;
//    String geo; геопозиция, лучше чем адрес
    String phone;
    String[] links;


    private Company(){}

    public Company(Long founderId, String name, String description){
        this.name = name;
        this.description = description;
        this.founderId = founderId;
    }

    public void addMan(){
        if (this.getID().equals(founderId)){

        }
    }
    public void requestApprove() {

    }

    public void edit(){

    }
}
