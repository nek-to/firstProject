package oop.homework.parentship.student;

/**
 * 1) Сделайте класс User, в котором будут следующие protected поля -
 * name (имя), age (возраст), public методы setName, getName, setAge, getAge.
 */
public class User {
    protected String name;
    protected int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
