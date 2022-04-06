package shildt.title_3;

import java.io.IOException;
import java.util.spi.AbstractResourceBundleProvider;

/**
 * Коды АSСII-символов нижнего регистра отличается от кодов соответствующих символов верхнего регистра на величину 32.
 * Следовательно, для преобразования строчной буквы в прописную нужно уменьшить ее код на 32.
 * Используйте это обстоятельство для написания программы, читающей символы с клавиатуры.
 * При выводе результатов данная программа должна преобразовывать строчные буквы в прописные, а прописные - в строчные.
 * Остальные символы не должны меняться. Работа программы должна завершаться после того, как пользователь введет с клавиатуры точку.
 * И наконец, сделайте так, чтобы программа отображала количество символов, для которых был изменен регистр.
 */
public class ReadingProgram {
    public static void main(String[] args) throws IOException {
        char input;
        int counter = 0;
        System.out.println("Введите букву: ");
        do {
            input = (char) System.in.read();
            if (input >= 'a' & input <= 'z') {
                input -= 32;
                System.out.println(input);
                counter++;
            } else if (input >= 'A' & input <= 'Z') {
                input += 32;
                System.out.println(input);
                counter++;
            }
            }while (input != '.');
        System.out.println("Всего было изменено " + counter +" символов.");
        }
    }