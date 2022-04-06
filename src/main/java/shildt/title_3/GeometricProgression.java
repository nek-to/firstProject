package shildt.title_3;

/**
 * Итерационное выражение для цикла for необязательно должно изменять переменную цикла на фиксированную величину.
 * Эта переменная может принимать произвольные значения.
 * Напишите программу, использующую цикл for для вывода чисел в геометрической прогрессии: 1, 2, 4, 8, 16, 32 и т.д
 */
public class GeometricProgression {
    public static void main(String[] args) {
        for (int i = 1; i < 100; i*=2) {
            System.out.println(i);
        }
    }
}
