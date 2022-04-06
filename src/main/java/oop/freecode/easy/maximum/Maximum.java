package oop.freecode.easy.maximum;

public class Maximum {
    public static Integer maximum (Integer [] list){
        Integer max = 0;
        for (Integer lists : list){
            if (lists > max) max = lists;
        }
        return max;
    }
}
