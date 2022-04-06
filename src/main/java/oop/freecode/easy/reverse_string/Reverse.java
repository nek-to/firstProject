package oop.freecode.easy.reverse_string;

public class Reverse {
    public static String reverse(String s) {
        String res = "";
        for (int i = s.length()-1; i >= 0; i--) {
            res += String.valueOf(s.charAt(i));
        }
        return res;
    }
}
