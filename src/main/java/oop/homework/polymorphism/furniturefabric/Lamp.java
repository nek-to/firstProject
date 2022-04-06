package oop.homework.polymorphism.furniturefabric;

public class Lamp extends Furniture{
    public Lamp() {
        super("Sweden", 7.99f);
    }

    @Override
    public String printInfo() {
        String info = "Country - " + super.getCountry() + ". Price = " + super.getPrice() + " $";
        return info;
    }
}
