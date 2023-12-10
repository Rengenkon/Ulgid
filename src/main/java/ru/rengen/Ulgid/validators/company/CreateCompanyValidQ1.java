package ru.rengen.Ulgid.validators.company;

import org.springframework.stereotype.Component;

@Component
public class CreateCompanyValidQ1 implements CreateCompanyValid.CreateComQuestion {
    @Override
    public Integer getNumber() {
        return 1;
    }

    @Override
    public String getQuestion() {
        return "Отправьте название компании";
    }

    @Override
    public String validate(String answer) {
        return null;
    }
}
