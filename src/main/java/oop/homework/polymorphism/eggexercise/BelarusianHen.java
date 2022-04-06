package oop.homework.polymorphism.eggexercise;

public class BelarusianHen extends Hen{
    public BelarusianHen() {
        super(6000000, "Belarus");
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Моя страна - " + super.getCountry() + ". Я несу " + super.getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
