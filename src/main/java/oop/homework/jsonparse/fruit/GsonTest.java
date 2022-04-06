package oop.homework.jsonparse.fruit;

public class GsonTest {
    public static void main(String[] args) {
        GsonParse gsonParse = new GsonParse();
        Fruit fruit = gsonParse.parse();
        System.out.println("Fruit " + fruit.toString());
    }
}
