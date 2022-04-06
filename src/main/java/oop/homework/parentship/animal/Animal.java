package oop.homework.parentship.animal;

//Класс Animal содержит переменные food, location и методы makeNoise, eat, sleep.
public class Animal {
    private String food;
    private String location;

    public void makeNoise(String noise) {
        System.out.println(noise);
    }

    public void eat(String eat) {
        System.out.println(eat);
    }

    public void sleep() {
        System.out.println("Спит");
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    final public void printAnimalInfo() {
        System.out.println(food + " " + location);
    }
}