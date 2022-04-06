package oop.homework.jsonparse.httpparse;

public class Distances {
    private int distance;
    private String word;

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    @Override
    public String toString() {
        return "Distances{" +
                "distance=" + distance +
                ", word='" + word + '\'' +
                '}';
    }
}
