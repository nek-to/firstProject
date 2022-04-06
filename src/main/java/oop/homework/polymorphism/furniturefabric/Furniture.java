package oop.homework.polymorphism.furniturefabric;

public class Furniture {
    private String country;
    private float price;

    public Furniture(String country, float price) {
        this.country = country;
        this.price = price;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String printInfo() {
        String info = "Данного товара нет в каталоге.";
        return info;
    }
}
