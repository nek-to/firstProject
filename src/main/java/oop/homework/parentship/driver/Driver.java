package oop.homework.parentship.driver;

import oop.homework.parentship.student.Worker;

/**
 * 2) Сделайте класс Driver (Водитель), который будет наследоваться от класса Worker из предыдущей задачи.
 * Этот метод должен вносить следующие private поля: водительский стаж, категория вождения (A, B, C).
 */
public class Driver extends Worker {
    private int drivingExperience;
    private String category;

    public int getDrivingExperience() {
        return drivingExperience;
    }

    public void setDrivingExperience(int drivingExperience) {
        this.drivingExperience = drivingExperience;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
