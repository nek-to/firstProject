package oop.freecode.easy.linear_search;

public class Search {
    public static int search(Integer n, Integer[] list){
        int i = 0;
        for (Integer lists : list){
            if (n.equals(lists)) return i;
            i++;
        }
        return -1;
    }
}
