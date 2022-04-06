package oop.homework.parentship.student;

/**
 * 2) Сделайте класс Worker, который наследует от класса User и вносит дополнительное
 * private поле salary (зарплата), а также методы public getSalary и setSalary.
 */
public class Worker extends User{
    private int salary;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
