package shildt.title_5;

public class Bubble {
    public static void main(String[] args) {
        int[] numbs = {99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49};
        int a, b, t, size = numbs.length;
        System.out.println("Исходный массив: ");
        for (int i = 0; i < numbs.length; i++) {
            System.out.print(numbs[i] + ", ");
        }
        for (a = 1; a < size; a++) {
            for (b = size - 1; b >= a; b--){
                if (numbs[b-1] > numbs[b]){
                    t = numbs[b-1];
                    numbs[b-1] = numbs[b];
                    numbs[b] = t;
                }
            }
        }
        System.out.println("\nОтсортированный массив: ");
        for (int i = 0; i < numbs.length; i++) {
            System.out.print(numbs[i] + ", ");
        }
    }
}
