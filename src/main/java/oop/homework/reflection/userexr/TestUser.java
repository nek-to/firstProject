package oop.homework.reflection.userexr;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class TestUser {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, InstantiationException {
        Constructor constructor = User.class.getConstructor(String.class, int.class);
        User user = (User) constructor.newInstance("Nick", 25);
        String defaultData = user.toString();
        System.out.println(defaultData);
        Field declaredFieldName = user.getClass().getDeclaredField("name");
        declaredFieldName.setAccessible(true);
        declaredFieldName.set(user, "Mike");
        Field declaredFieldAge = user.getClass().getDeclaredField("age");
        declaredFieldAge.setAccessible(true);
        declaredFieldAge.set(user, 30);
        Object name = declaredFieldName.get(user);
        Object age = declaredFieldAge.get(user);
        System.out.println("New Name: " + name);
        System.out.println("New Age: " + age);
    }
}
