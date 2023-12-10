package ru.rengen.Ulgid.validators.company;

import org.springframework.stereotype.Component;

@Component
public class CreateEventQuestionImplQ2 implements CreateEventValid.CreateEventQuestion {
    @Override
    public Integer getNumber() {
        return 2;
    }

    @Override
    public String getQuestion() {
        return "Введите название мероприятия";
    }

    @Override
    public String validate(String answer) {
        return null;
    }
}
