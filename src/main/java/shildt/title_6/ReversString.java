package shildt.title_6;

/**
 * Напишите рекурсивный метод, отображающий строку задом наперед
 */
public class ReversString {
    String msg;

    ReversString(String s){
        msg = s;
    }

    void revers(int idx){
        if (idx != msg.length()-1) revers(idx+1);

        System.out.print(msg.charAt(idx));
    }
}
