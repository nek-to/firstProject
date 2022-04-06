package oop.homework.parentship.employee;

public class Worker extends Employee{
    int workTime;

    public Worker(int workTime) {
        this.workTime = workTime;
    }

    @Override
    public void payment() {
        System.out.println(100 * workTime);
    }
}
