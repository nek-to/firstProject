package shildt.title_1.others;

/**
 * Видоизмените программу, созданную в упражнении 1 .2, таким образом, чтобы она выводила таблицу перевода дюймов в метры.
 * Выведите значения длины до 12 футов через каждый дюйм. После каждых 1 2 дюймов выведите пустую строку.
 * (Один метр приблизительно равен 39,37 дюйма.)
 */
public class ModifiedDuimConverter {
    public static void main(String[] args) {
        double inch;
        double meter;
        int fut = 0;
        int counter = 0;

        for (inch = 1; inch <= 144; inch++) {
            meter = 39.37 * inch;
            System.out.println(inch + " inch =" + meter + " meters");
            counter++;
            if (counter == 12) {
                fut += 1;
                System.out.println(fut + " fut" + "\n");
                counter = 0;
            }
        }
    }
}
