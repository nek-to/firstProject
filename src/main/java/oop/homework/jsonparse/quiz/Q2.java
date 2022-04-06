package oop.homework.jsonparse.quiz;

import java.util.ArrayList;

public class Q2 {
    private String question;
    private ArrayList<String> options;
    private String answer;

    public Q2(String question, ArrayList<String> options, String answer) {
        this.question = question;
        this.options = options;
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public ArrayList<String> getOptions() {
        return options;
    }

    public void setOptions(ArrayList<String> options) {
        this.options = options;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "Q2{" +
                "question='" + question + '\'' +
                ", options=" + options +
                ", answer=" + answer +
                '}';
    }
}
