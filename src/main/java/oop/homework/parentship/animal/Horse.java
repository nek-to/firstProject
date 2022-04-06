package oop.homework.parentship.animal;

public class Horse extends Animal{
    int hoofCondition;
    boolean rider;

    public int getHoofCondition() {
        return hoofCondition;
    }

    public void setHoofCondition(int hoofCondition) {
        this.hoofCondition = hoofCondition;
    }

    public boolean isRider() {
        return rider;
    }

    public void setRider(boolean rider) {
        this.rider = rider;
    }

    @Override
    public void makeNoise(String noise) {
        System.out.println("Гогочет");
    }

    @Override
    public void eat(String eat) {
        System.out.println("Ест овес");
    }
}
