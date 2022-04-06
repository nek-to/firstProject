package shildt.title_3;

import java.io.IOException;

/**
 * Напишите программу, которая считывает символы с клавиатуры до тех пор, пока не встретится точка.
 * Предусмотрите в программе счетчик пробелов. Сведения о количестве пробелов должны выводиться в конце программы.
 */
public class Interer {
    public static void main(String[] args) throws IOException {
        char input;
        char ignore;
        int dotCount = 0;

        for (; ; ) {
            System.out.println("Введите символ: ");
            input = (char) System.in.read();
            do {
                ignore = (char) System.in.read();
            }while (ignore != '\n');
            if (input == ' ') {
                dotCount++;
            } else if (input == '.') break;
        }
        System.out.println(dotCount);
    }
}