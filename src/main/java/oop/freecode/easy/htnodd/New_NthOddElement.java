package oop.freecode.easy.htnodd;

import java.util.List;

public class New_NthOddElement {
    public Integer getElement(List<Integer> list, Integer n){
        int elementIndex = 2 * (n -1);
        return elementIndex > list.size() - 1 ? - 1 : list.get(elementIndex);
    }
}
