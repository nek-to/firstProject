package shildt.title_8;

import shildt.title_8.exer8_1.CircularQueue;
import shildt.title_8.exer8_1.DynQueue;
import shildt.title_8.exer8_1.FixedQueue;
import shildt.title_8.exer8_1.ICharQ;

public class IQDemo {
    public static void main(String[] args) {
        FixedQueue fixedQueue = new FixedQueue(10);
        DynQueue dynQueue = new DynQueue(5);
        CircularQueue circularQueue = new CircularQueue(10);

        ICharQ iQ;

        char ch;
        int i;

        iQ = fixedQueue;
        for (i = 0; i < 10; i++) {
            iQ.put((char) ('A' + i));
        }
        System.out.println();

        iQ = dynQueue;
        for (i = 0; i < 10; i++) {
            iQ.put((char) ('Z' - i));
        }
        System.out.println();

        iQ = circularQueue;
        for (i = 0; i < 10; i++) {
            iQ.put((char) ('A' + i));
        }
        System.out.println("Содержимое кольцевой очереди: ");
        for (i = 0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }
        System.out.println();
        for (i = 0; i < 20; i++) {
            iQ.put((char) ('A' + i));
        }
        System.out.println("Содержимое кольцевой очереди: ");
        for (i = 0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }
        System.out.println("\n Сохранение и использование данных" + " кольцевой очереди.");
        for (i = 0; i < 20; i++) {
            iQ.put((char) ('A' + i));
            ch = iQ.get();
            System.out.print(ch);
        }
    }

}
