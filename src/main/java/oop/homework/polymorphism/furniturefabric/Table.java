package oop.homework.polymorphism.furniturefabric;

public class Table extends Furniture{
    public Table() {
        super("Ukraine", 21.5f);
    }

    @Override
    public String printInfo() {
        String info = "Country - " + super.getCountry() + ". Price = " + super.getPrice() + " $";
        return info;
    }
}
