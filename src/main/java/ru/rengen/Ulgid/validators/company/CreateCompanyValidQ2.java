package ru.rengen.Ulgid.validators.company;

import org.springframework.stereotype.Component;

@Component
public class CreateCompanyValidQ2 implements CreateCompanyValid.CreateComQuestion {
    @Override
    public Integer getNumber() {
        return 2;
    }

    @Override
    public String getQuestion() {
        return "Отправьте описание компании";
    }

    @Override
    public String validate(String answer) {
        return null;
    }
}
