package oop.homework.interfaceexr.instuments;

public class Test {
    public static void main(String[] args) {
        InstrumentsI[] instruments = {new Guitar(6), new Guitar(12), new Drums(4), new Trumpet(25)};
        for (int i = 0; i < instruments.length; i++) {
            instruments[i].play();
        }
    }
}
