package oop.homework.polymorphism.furniturefabric;

public class RockingChair extends Furniture{
    public RockingChair() {
        super("Belarus", 999.99f);
    }

    @Override
    public String printInfo() {
        String info = "Country - " + super.getCountry() + ". Price = " + super.getPrice() + " $";
        return info;
    }
}
