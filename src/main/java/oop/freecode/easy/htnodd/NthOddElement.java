package oop.freecode.easy.htnodd;

import java.util.List;

public class NthOddElement {
    public static Integer getElement(List<Integer> list, Integer n){
        int counter = 0;
        int ans = -1;
        for (Integer lists: list){
            if (!(lists % 2 == 0 ) & counter == n || lists == 0){
                ans = lists;
                break;
            } counter ++;
        }
        return ans;
    }
}
