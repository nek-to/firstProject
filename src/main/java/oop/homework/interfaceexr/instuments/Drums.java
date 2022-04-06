package oop.homework.interfaceexr.instuments;

public class Drums implements InstrumentsI{
    private int size;

    public Drums(int size) {
        this.size = size;
    }

    @Override
    public void play() {
        System.out.println("Playing " + size + " size drum.");
    }
}
