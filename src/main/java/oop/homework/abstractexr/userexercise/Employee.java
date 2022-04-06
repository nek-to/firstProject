package oop.homework.abstractexr.userexercise;

public class Employee extends User {
    private int workPriority;
    private String ticket = "Employee";


    public Employee(String name, String surname, int age, boolean working, boolean lunch, int workPriority) {
        super(name, surname, age, working, lunch);
        this.workPriority = workPriority;
    }

    public Employee(String mike, String vazovski, int age, boolean working, boolean lunch) {
        super(mike, vazovski, age, working, lunch);
    }

    public int getWorkPriority() {
        return workPriority;
    }

    public void setWorkPriority(int workPriority) {
        this.workPriority = workPriority;
    }

    @Override
    public String getTicket() {
        return ticket;
    }

    @Override
    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    @Override
    public void onWork() {
        if (working == true) {
            System.out.println("On work.");
        } else {
            System.out.println("Absent.");
        }
    }

    @Override
    public void eating() {
        if (working == true) {
            if (lunch == true) {
                System.out.println("Lunch.");
            } else {
                System.out.println("On work");
            }
        } else {
        }
    }
}
