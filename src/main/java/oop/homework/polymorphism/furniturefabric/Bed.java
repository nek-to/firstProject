package oop.homework.polymorphism.furniturefabric;

public class Bed extends Furniture{
    public Bed() {
        super("Canada", 299.99f);
    }

    @Override
    public String printInfo() {
        String info = "Country - " + super.getCountry() + ". Price = " + super.getPrice() + " $";
        return info;
    }
}
