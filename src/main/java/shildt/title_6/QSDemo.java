package shildt.title_6;

public class QSDemo {
    public static void main(String[] args) {
        char a[] = {'d', 'x', 'a', 'r', 'p', 'j', 'i'};

        System.out.println("Исходный массив: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }

        System.out.println();
        System.out.println("Сортированный массив: ");
        Quicksort.qsort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
    }
}
