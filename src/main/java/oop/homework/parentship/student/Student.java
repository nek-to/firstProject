package oop.homework.parentship.student;

/**
 * 4) Сделайте класс Student, который наследует от класса User и вносит дополнительные
 * private поля стипендия, курс, а также геттеры и сеттеры для них.
 */
public class Student extends  User{
    private int scholarship;
    private int course;

    public int getScholarship() {
        return scholarship;
    }

    public void setScholarship(int scholarship) {
        this.scholarship = scholarship;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }
}
