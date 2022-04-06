package oop.homework.polymorphism.eggexercise;

public class UkrainianHen extends Hen {
    public UkrainianHen() {
        super(15, "Ukraine");
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Моя страна - " + getCountry() + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}