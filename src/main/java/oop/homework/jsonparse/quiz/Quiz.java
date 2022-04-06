package oop.homework.jsonparse.quiz;

public class Quiz {
    private Sport sport;
    private Maths maths;

    public Quiz(Sport sport, Maths maths) {
        this.sport = sport;
        this.maths = maths;
    }

    public Sport getSport() {
        return sport;
    }

    public void setSport(Sport sport) {
        this.sport = sport;
    }

    public Maths getMaths() {
        return maths;
    }

    public void setMaths(Maths maths) {
        this.maths = maths;
    }

    @Override
    public String toString() {
        return "Quiz{" +
                "sport=" + sport +
                ", maths=" + maths +
                '}';
    }
}
