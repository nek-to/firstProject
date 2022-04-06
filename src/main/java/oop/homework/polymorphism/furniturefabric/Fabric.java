package oop.homework.polymorphism.furniturefabric;

public class Fabric {
    public static Furniture getFurnitureByType(String furnitureType){
        switch (furnitureType){
            case "Chair": return new Chair();
            case "Lamp": return new Lamp();
            case "Table": return new Table();
            case "Bed": return new Bed();
            case "Rocking chair": return new RockingChair();
        }return null;
    }
}
