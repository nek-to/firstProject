package oop.homework.abstractexr.figure;

/**
 * 1) Сделайте иерархию по геометрическим фигурам(базовый класс фигура)
 * абстрактные методы вычисления площади/периметра и конкретные классы треугольник,
 * прямоугольник и т.д.
 */
public abstract class Figure{
    public abstract void perimetrCalc();
    public abstract void squareCalc();
    public abstract void printInfo();
    public abstract String toString();
}
