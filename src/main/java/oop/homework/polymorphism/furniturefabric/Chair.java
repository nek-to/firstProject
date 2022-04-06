package oop.homework.polymorphism.furniturefabric;

public class Chair extends Furniture{
    public Chair() {
        super("Brazil", 12.5f);
    }

    @Override
    public String printInfo() {
        String info = "Country - " + super.getCountry() + ". Price = " + super.getPrice() + " $";
        return info;
    }
}
