package shildt.title_3;

/**
 * Напишите цикл for, в котором перебирались бы значения от 1000 до О с шагом 2.
 */
public class ForFrom1000To0 {
    public static void main(String[] args) {
        for (int i = 1000; i > 0; i--) {
            if (i % 2 == 0) System.out.println(i);
        }
    }
}
