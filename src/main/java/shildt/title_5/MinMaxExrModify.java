package shildt.title_5;

public class MinMaxExrModify {
    public static void main(String[] args) {
        int [] numbs = new  int [] {99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49};
        int min, max;

        max = min = numbs[0];
        for (int index : numbs){
            if (index < min) min = index;
            if (index > max) max = index;
        }
        System.out.println(min + " min\n" + max + " max");
    }
}
