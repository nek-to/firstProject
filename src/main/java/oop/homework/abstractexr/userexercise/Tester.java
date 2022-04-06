package oop.homework.abstractexr.userexercise;

public class Tester {
    public static void main(String[] args) {
        User[] massUsers = {new Employee("Mike", "Vazovski", 26, false, false, 1),
                new Student("Gabe", "Evans", 17, true, true, 4)};
        for (int i = 0; i < massUsers.length; i++) {
            System.out.println(massUsers[i].getName() +" - " + massUsers[i].getTicket());
            massUsers[i].onWork();
            massUsers[i].eating();
            System.out.println();
        }
    }
}
