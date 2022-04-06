package oop.homework.polymorphism.furniturefabric;

import com.sun.source.tree.IfTree;
import oop.homework.polymorphism.eggexercise.TypesOfFurniture;

import java.util.Locale;
import java.util.Scanner;

/**
 * Возникла проблема с Rocking chair. При вводе выдает ошибку. Если убрать пробел - все работает.
 * Не могу решить проблему.
 * Хотел добавить сравнение с enum, но НЕ СМОГ РЕАЛИЗОВАТЬ , пример кода:
 *         Scanner scanner = new Scanner(System.in);
 *         System.out.println("Enter the type of furniture: ");
 *         String userScanner = scanner.next();
 *         TypesOfFurniture[] typesOfFurniture = TypesOfFurniture.values();
 *         if (userScanner.equals(typesOfFurniture)) {
 *             Furniture furniture = Fabric.getFurnitureByType(userScanner);
 *             System.out.println(furniture.printInfo());
 *         } else System.out.println("Incorrect enter, please try again!");
 */
public class FurnitureShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the type of furniture: ");
        String userScanner = scanner.next();
        TypesOfFurniture[] typesOfFurniture = TypesOfFurniture.values();
        Furniture furniture = Fabric.getFurnitureByType(userScanner);
        System.out.println(furniture.printInfo());
    }
}