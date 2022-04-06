package oop.homework.interfaceexr.printable;

public class Test {
    public static void main(String[] args) {
        PrintableI [] print = {new Book("Booklin"), new Magazine("Planet"), new Magazine("Magzilini"), new Book("Liar")};
        for (int i = 0; i < print.length; i++) {
            print[i].print();
        }
        System.out.println("----------------");
        Book.printBook(print);
        Magazine.printMagazine(print);
    }
}
