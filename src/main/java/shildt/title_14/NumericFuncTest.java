package shildt.title_14;

/**
 * Создайте блочное лямбда-выражение для вычисления факториала целого числа.
 * Продемонстрируйте его использование. В качестве функционального интерфейса используйте интерфейс
 * NumericFunc, который рассматривался в этой главе.
 */

public class NumericFuncTest {
    public static void main(String[] args) {
        NumericFunc numericFunc = (n) -> {
            int res = n;
            if (n == 0) return 1;
            for (int i = n - 1; i > 0; i--) {
                res *= i;
            }
            return res;
        };

        System.out.println(numericFunc.func(2));
    }
}
