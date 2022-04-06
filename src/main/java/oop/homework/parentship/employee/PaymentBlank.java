package oop.homework.parentship.employee;

public class PaymentBlank {
    public static void main(String[] args) {
        Employee[] employees = {new Manager(), new Manager(), new Manager(), new Agent(5000),
                new Agent(10000), new Agent(15000), new Worker(160),
        new Worker(180), new Worker(210)};
        for (int i = 0; i < employees.length; i++) {
            employees[i].payment();
        }
    }
}