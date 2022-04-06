package oop.homework.interfaceexr.printable;

public class Book implements PrintableI {
    private String nameBook;

    public Book(String name) {
        this.nameBook = name;
    }

    @Override
    public void print() {
        System.out.println("Printing book " + nameBook + ".");
    }

    static void printBook(PrintableI[] printable) {
        for (PrintableI printables : printable) {
            if (printables instanceof Book)
            System.out.println(printables);
        }
    }

    @Override
    public String toString() {
        return "nameBook='" + nameBook + '\'';
    }
}
