package oop.homework.abstractexr.figure;

public class Square extends Figure{

    public Square(int length){
        this.length = length;
    }

    private int length;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public void perimetrCalc() {
        System.out.println("P = " + 4 * length);
    }

    @Override
    public void squareCalc() {
        System.out.println("S = " + length * length);
    }
    public void printInfo(){
        System.out.println("Square");
    }

    @Override
    public String toString() {
        return "length=" + length;
    }
}
