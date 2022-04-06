package oop.homework.interfaceexr.instuments;

public class Trumpet implements InstrumentsI{
    private int diameter;

    public Trumpet(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public void play() {
        System.out.println("Playing " + diameter + " diameter trumpet.");
    }
}
