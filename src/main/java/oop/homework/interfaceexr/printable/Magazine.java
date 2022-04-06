package oop.homework.interfaceexr.printable;

public class Magazine implements PrintableI {
    private String nameMagazine;

    public Magazine(String magazine) {
        nameMagazine = magazine;
    }

    @Override
    public void print() {
        System.out.println("Printing magazine " + nameMagazine + ".");
    }

    static void printMagazine(PrintableI[] printable) {
        for (PrintableI printables : printable) {
            if (printables instanceof Magazine)
                System.out.println(printables);
        }
    }

    @Override
    public String toString() {
        return "nameMagazine='" + nameMagazine + '\'';
    }
}