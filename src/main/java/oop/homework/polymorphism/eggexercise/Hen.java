package oop.homework.polymorphism.eggexercise;

public class Hen {
    private int countOfEggsPerMonth;
    private String country;

    public Hen(int countOfEggsPerMonth, String country) {
        this.countOfEggsPerMonth = countOfEggsPerMonth;
        this.country = country;
    }

    public int getCountOfEggsPerMonth() {
        return countOfEggsPerMonth;
    }

    public void setCountOfEggsPerMonth(int countOfEggsPerMonth) {
        this.countOfEggsPerMonth = countOfEggsPerMonth;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDescription(){
        String massage = "Я курица";
        return massage;
    }
}
