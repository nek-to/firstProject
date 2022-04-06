package oop.homework.abstractexr.figure;

public class Triangle extends Figure {
    public Triangle(float firstSide, int secondSide, int base, int height) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.base = base;
        this.height = height;
    }

    private float firstSide;
    private int secondSide;
    private int base;
    private int height;

    public float getFirstSide() {
        return firstSide;
    }

    public void setFirstSide(float firstSide) {
        this.firstSide = firstSide;
    }

    public int getSecondSide() {
        return secondSide;
    }

    public void setSecondSide(int secondSide) {
        this.secondSide = secondSide;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }
     public int getHeight(){
        return height;
     }

     public void setHeight(){
        this.height = height;
     }
    @Override
    public void perimetrCalc() {
        System.out.println("P = " + firstSide + secondSide + base);
    }

    @Override
    public void squareCalc() {
        System.out.println("S = " + ((base * height) / 2));
    }

    @Override
    public void printInfo() {
        System.out.println("Triangle");
    }

    @Override
    public String toString() {
        return "firstSide=" + firstSide +
                ", secondSide=" + secondSide +
                ", base=" + base +
                ", height=" + height;
    }
}
