package ru.rengen.Ulgid.validators;

import ru.rengen.Ulgid.telegram.models.Company;

import java.util.List;
import java.util.Map;

public abstract class Valid {
    public interface Question {
        Integer getNumber();
        String getQuestion();
        String validate(String answer);
        // return null if answer is valid
        // else return error text
    }

    protected Map<Integer, Question> questions;
    protected List<Integer> stateList;

    public String getQuestion(String questionState) {
        return questions.get(Integer.parseInt(questionState)).getQuestion();
    }
    public String validateAnswer(String questionState, String answer) {
        return questions.get(Integer.parseInt(questionState)).validate(answer);
    }

    public String getFirstState(){
        return stateList.getFirst().toString();
    }

    public boolean isFinalState(String state) {
        return stateList.getLast().equals(Integer.parseInt(state));
    }

    public String getNextState(String state) {
        return stateList.get(
                        stateList.indexOf(Integer.parseInt(state)) + 1)
                        .toString();
    }

}
