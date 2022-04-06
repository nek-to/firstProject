package oop.homework.abstractexr.figure;

public class Circle extends Figure{
    private float p = 3.14f;
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public float getP() {
        return p;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void squareCalc() {
        System.out.println("S = " + p * radius);
    }

    @Override
    public void perimetrCalc() {
        System.out.println("P = " + 2 * p * radius);
    }

    @Override
    public void printInfo() {
        System.out.println("Circle");
    }

    @Override
    public String toString() {
        return "p=" + p +
                ", radius=" + radius;
    }
}
