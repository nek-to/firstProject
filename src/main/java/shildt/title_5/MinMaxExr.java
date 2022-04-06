package shildt.title_5;

public class MinMaxExr {
    public static void main(String[] args) {
        int [] numbs = new  int [] {99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49};
        int min, max;

        max = min = numbs[0];
        for (int i = 1; i < 10; i++){
            if (numbs[i] < min) min = numbs[i];
            if (numbs[i] > max) max = numbs[i];
        }
        System.out.println(min + " min\n" + max + " max");
    }
}
