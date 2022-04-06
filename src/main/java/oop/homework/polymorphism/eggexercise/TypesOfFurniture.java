package oop.homework.polymorphism.eggexercise;

public enum TypesOfFurniture {
    Chair("Стул"),
    Lamp("Лампа"),
    Table("Стол"),
    Bed("Кровать"),
    Rockingchair("Кресло-качалка");

    String additionalName;

    TypesOfFurniture(String additionalName) {
        this.additionalName = additionalName;
    }
}
