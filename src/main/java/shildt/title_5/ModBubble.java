package shildt.title_5;

/**
 * Измените программу, написанную в упражнении 5. 1, таким образом, чтобы она сортировала массив строк.
 * Продемонстрируйте ее работоспособность.
 */
public class ModBubble {
    public static void main(String[] args) {
        String[] strings = {"Один", "Два", "Три", "Четыре", "Пять"};
        int a, b;
        String t;
        int size = strings.length;
        System.out.println("Исходный массив: ");
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ", ");
        }
        for (a = 1; a < size; a++) {
            for (b = size - 1; b >= a; b--) {
                if (strings[b - 1].compareTo(strings[b]) > 0);
                t = strings[b - 1];
                strings[b - 1] = strings[b];
                strings[b] = t;
            }
        }
        System.out.println("\nОтсортированный массив: ");
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ", ");
        }
    }
}
