package oop.homework.jsonparse.quiz;

public class Maths {
    private Q1 q1;
    private Q2 q2;

    public Maths(Q1 q1, Q2 q2) {
        this.q1 = q1;
        this.q2 = q2;
    }

    public Q1 getQ1() {
        return q1;
    }

    public void setQ1(Q1 q1) {
        this.q1 = q1;
    }

    public Q2 getQ2() {
        return q2;
    }

    public void setQ2(Q2 q2) {
        this.q2 = q2;
    }

    @Override
    public String toString() {
        return "Maths{" +
                "q1=" + q1 +
                ", q2=" + q2 +
                '}';
    }
}
