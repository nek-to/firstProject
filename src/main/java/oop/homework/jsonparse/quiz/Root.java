package oop.homework.jsonparse.quiz;

public class Root {
    private Quiz quiz;

    public Quiz getQuiz() {
        return quiz;
    }

    public void setQuiz(Quiz quiz) {
        this.quiz = quiz;
    }

    @Override
    public String toString() {
        return "Root{" +
                "quiz=" + quiz +
                '}';
    }
}
