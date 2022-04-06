package oop.homework.parentship.animal;

public class Cat extends Animal {
    boolean street;
    int livesValue;

    public boolean isStreet() {
        return street;
    }

    public void setStreet(boolean street) {
        this.street = street;
    }

    public int getLivesValue() {
        return livesValue;
    }

    public void setLivesValue(int livesValue) {
        this.livesValue = livesValue;
    }

    @Override
    public void makeNoise(String noise) {
        System.out.println("Мяукает");
    }

    @Override
    public void eat(String eat) {
        System.out.println("Ест корм");
    }
}
