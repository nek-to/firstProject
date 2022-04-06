package oop.homework.abstractexr.figure;

public class Test {
    public static void main(String[] args) {
        Figure [] massFigure = {new Square(3), new Triangle(2,4,6,5), new Circle(7)};
        for (int i = 0; i < massFigure.length; i++) {
            massFigure[i].printInfo();
            System.out.println(massFigure[i].toString());
            massFigure[i].perimetrCalc();
            massFigure[i].squareCalc();
            System.out.println();
        }
    }
}
