package oop.freecode.easy.average;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        System.out.println(Average.average(list));

        System.out.println(NewAverage.average(list));
    }
}
