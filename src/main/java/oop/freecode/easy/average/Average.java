package oop.freecode.easy.average;

import java.util.List;

public class Average {
    public static Double average(List<Integer> list) {
        Double sum = 0.0;
        int counter = 0;
        for (Integer lists : list) {
            sum += lists;
            counter++;
        }
        Double avg = sum / counter;

        return avg;
    }
}
