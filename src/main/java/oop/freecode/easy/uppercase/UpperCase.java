package oop.freecode.easy.uppercase;

import java.util.List;
import java.util.stream.Collectors;

public class UpperCase {
    public static List<String> upperCase(List<String> list){
        //it's not my solution

        return list.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }
}
