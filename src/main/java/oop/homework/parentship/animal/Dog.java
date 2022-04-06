package oop.homework.parentship.animal;

public class Dog extends Animal {
    int noiseValue;
    boolean hunter;

    public int getNoiseValue() {
        return noiseValue;
    }

    public void setNoiseValue(int noiseValue) {
        this.noiseValue = noiseValue;
    }

    public boolean isHunter() {
        return hunter;
    }

    public void setHunter(boolean hunter) {
        this.hunter = hunter;
    }

    @Override
    public void makeNoise(String noise) {
        System.out.println("Лает");
    }

    @Override
    public void eat(String eat) {
        System.out.println("Грызет кость");
    }
}