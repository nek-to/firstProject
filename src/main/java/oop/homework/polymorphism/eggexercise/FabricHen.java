package oop.homework.polymorphism.eggexercise;

public class FabricHen {
    public static Hen getHenByType(String countryName) {
        switch (countryName) {
            case "Russia": return new RussianHen();
            case "Ukraine": return new UkrainianHen();
            case "Moldova": return new MoldovanHen();
            case "Belarus": return new BelarusianHen();
        }return null;
    }
}