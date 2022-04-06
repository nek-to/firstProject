package oop.homework.abstractexr.userexercise;

public class Student extends User {
    private int course;
    private String ticket = "Student";

    public Student(String name, String surname, int age, boolean working, boolean lunch, int course) {
        super(name, surname, age, working, lunch);
        this.course = course;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
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
        if (isWorking()) {
            System.out.println("On work.");
        } else {
            System.out.println("Absent.");
        }
    }

    @Override
    public void eating() {
        if (isWorking()) {
            if (isLunch()) {
                System.out.println("Lunch.");
            } else {
                System.out.println("On work.");
            }
        } else {
        }
    }
}