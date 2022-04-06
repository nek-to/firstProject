package shildt.title_5;

/**
 * Напишите программу, в которой массив используется для нахождения среднего арифметического
 * десяти значений типа douЫe. Используйте любые десять чисел.
 */
public class MidArch {
    public static void main(String[] args) {
        int mas[] = {12, 34, 34, 53, 5, 566, 65, 2, 3, 5};
        double ans;
        double sum = 0;

        for (int i = 0; i < mas.length; i++) {
            sum += mas[i];
        }
        ans = sum / mas.length;
        System.out.println(ans);
    }
}
