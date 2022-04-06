package oop.homework.polymorphism.eggexercise;

public class MoldovanHen extends Hen {
    public MoldovanHen() {
        super(10, "Moldova");
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Моя страна - " + getCountry() + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";

    }
}