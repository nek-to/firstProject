package oop.homework.parentship.employee;

public class Agent extends Employee{
    double sales;

    public Agent(double sales) {
        this.sales = sales;
    }

    @Override
    public void payment() {
        System.out.println(5000 * (sales * 0.05));
    }
}
