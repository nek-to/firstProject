package oop.homework.polymorphism.eggexercise;

import oop.homework.polymorphism.eggexercise.BelarusianHen;
import oop.homework.polymorphism.eggexercise.FabricHen;
import oop.homework.polymorphism.eggexercise.Hen;
import oop.homework.polymorphism.eggexercise.RussianHen;

public class Tester {
    public static void main(String[] args) {
        String[] country = {"Belarus", "Russia", "Ukraine", "Moldova"};
        for (int i = 0; i < country.length; i++) {
            Hen hen = FabricHen.getHenByType(country[i]);
            System.out.println(hen.getDescription());
        }
    }
}