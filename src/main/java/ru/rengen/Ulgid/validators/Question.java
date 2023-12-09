package ru.rengen.Ulgid.validators;

import java.util.Comparator;

public interface Question {
    Integer getNumber();
    String getQuestion();
    String validate(String answer);
    // return null if answer is valid
    // else return error text
}
