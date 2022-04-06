package oop.homework.parentship.student;

/**
 * 3) Создайте объект этого класса 'Иван', возраст 25, зарплата 1000.
 * Создайте второй объект этого класса 'Вася', возраст 26, зарплата 2000.
 * Найдите сумму зарплата Ивана и Васи.
 */
public class Tester {
    public static void main(String[] args) {
        Worker ivan = new Worker();
        ivan.setName("Иван");
        ivan.setAge(25);
        ivan.setSalary(1000);

        Worker vasily = new Worker();
        vasily.setName("Вася");
        vasily.setAge(26);
        vasily.setSalary(2000);

        int sum = ivan.getSalary() + vasily.getSalary();
        System.out.println("Сумммарная заработная плата Васи и Ивана = " + sum);
    }
}
