package oop.homework.reflection.hashchecker;

import oop.homework.reflection.hashchecker.StringClass;

import java.lang.reflect.Field;

/**1) напиши программу, в которой попробуй сделать так чтобы ты смогу к строке добавить символы(модифицировать строку)
 и при этом чтобы hashcode данной строки не изменился, и изменения остались (адрес памяти не поменялся) - используй для этого рефлексию
 String str = "test";
 int hashBeforeChanges = str.hash();
 ...//модификация строки
 int hashAfterChanges = str.hash();
 sout(hashBeforeChanges == hashAfterChanges);//должно вернуть true**/

public class Test {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Object str = new StringClass();
        int hashBeforeChanges = str.hashCode();
        int hashAfterChanges;
        System.out.println(hashBeforeChanges);
        Field name = str.getClass().getDeclaredField("name");
        name.setAccessible(true);
        name.set(str, "Porsche");
        hashAfterChanges = str.hashCode();
        System.out.println(hashAfterChanges == hashBeforeChanges);
    }
}
