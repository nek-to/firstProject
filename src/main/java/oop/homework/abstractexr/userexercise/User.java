package oop.homework.abstractexr.userexercise;

import javax.swing.*;

/**
 * 2) Пусть у вас есть класс User, а от него наследуют классы Employee и Student.
 * При этом предполагается, что вы будете создавать объекты классов Employee и Student,
 * но объекты класса User - не будете, так как сам класс User используется только для
 * группировки общих свойств и методов своих наследников.
 * В этом случае можно принудительно запретить создавать объекты класса User, чтобы вы или
 * другой программист где-нибудь их случайно не создали.
 * Для этого существуют так называемые абстрактные классы.
 * Продемонстрируйте иерархию для этой задачи в коде
 * Работник Студент
 */
public abstract class User {
    private String name;
    private String surname;
    private int age;
    protected boolean working;
    protected boolean lunch;
    private String ticket;

    public User(String name, String surname, int age, boolean working, boolean lunch) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.working = working;
        this.lunch = lunch;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isWorking() {
        return working;
    }

    public void setWorking(boolean working) {
        this.working = working;
    }

    public boolean isLunch() {
        return lunch;
    }

    public void setLunch(boolean lunch) {
        this.lunch = lunch;
    }

    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }


    public abstract void onWork();
    public void eating(){};
}
