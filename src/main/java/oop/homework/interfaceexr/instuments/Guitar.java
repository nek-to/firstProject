package oop.homework.interfaceexr.instuments;

public class Guitar implements InstrumentsI{
    private int stringQuantity;

    public Guitar(int stringQuantity) {
        this.stringQuantity = stringQuantity;
    }

    @Override
    public void play() {
        System.out.println("Playing " + stringQuantity + " strings guitar.");
    }
}
