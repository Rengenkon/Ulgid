package ru.rengen.Ulgid.validators.company;

import org.springframework.stereotype.Component;

@Component
public class CreateEventQuestionImplQ1 implements CreateEventValid.CreateEventQuestion {
    @Override
    public Integer getNumber() {
        return 1;
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
