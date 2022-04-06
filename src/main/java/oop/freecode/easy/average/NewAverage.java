package oop.freecode.easy.average;

import java.util.List;

public class NewAverage {
    public static Double average(List<Integer> list) {
        return list.stream()
                .mapToInt(i -> i)
                .average()
                .getAsDouble();

    }
}
