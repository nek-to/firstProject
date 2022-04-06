package oop.homework.polymorphism.eggexercise;

public class RussianHen extends Hen {
    public RussianHen() {
        super(30, "Russia");
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Моя страна - " + getCountry() + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }

    @Override
    public String toString() {
        return "RussianHen{}";
    }
}