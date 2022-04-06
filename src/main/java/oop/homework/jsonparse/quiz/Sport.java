package oop.homework.jsonparse.quiz;

public class Sport {
    private Q1 q1;

    public Sport(Q1 q1) {
        this.q1 = q1;
    }

    public Q1 getQ1() {
        return q1;
    }

    public void setQ1(Q1 q1) {
        this.q1 = q1;
    }

    @Override
    public String toString() {
        return "Sport{" +
                "q1=" + q1 +
                '}';
    }
}
