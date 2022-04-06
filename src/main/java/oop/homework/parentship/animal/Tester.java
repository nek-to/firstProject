package oop.homework.parentship.animal;

public class Tester {
    public static void main(String[] args) {
        Dog bob = new Dog();
        bob.setFood("bones");
        bob.setLocation("Boston");
        Cat cat = new Cat();
        cat.setFood("fish");
        cat.setLocation("Canada");
        Horse horse = new Horse();
        horse.setFood("oats");
        horse.setLocation("Pembroke");
        Vet vet = new Vet();

        Animal[] animals = {bob, cat, horse};
        for (int i = 0; i < animals.length; i++) {
            vet.treatAnimal(animals[i]);
        }

        Cat kitty = new Cat();
        kitty.setFood("Fish");
        kitty.setLocation("Minsk");
        kitty.printAnimalInfo();
    }
}