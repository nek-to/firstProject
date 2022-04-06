package shildt.title_3;

import java.io.IOException;

// Приложение, выдающее инструкцию выполнения функций if и switch
public class IfSwitchExrModifi {
    public static void main(String[] args) throws IOException {
        char input;
        char ignore;
        for (; ; ) {
            do {
                System.out.println("Справка:\n\t1. if\n\t2. switch\n\t3. for\n\t4. while\n\t5. do-while\n\t6. break\n\t7. continue\n Выберите...");
                input = (char) System.in.read();
                do {
                    ignore = (char) System.in.read();
                } while (ignore != '\n');
            } while (input < '1' | input > '7' & input != 'q');

            if (input == 'q') break;

            switch (input) {
                case '1':
                    System.out.println("Инструкция:\nif(условие) инструкция\n\telse инструкция");
                    break;
                case '2':
                    System.out.println("Инструкция:\nswitch(выражение)\ncase: константа\n\tинструкция\ncase n: константа\n\tинструкция\ndefault: инструкция");
                    break;
                case '3':
                    System.out.println("Инструкция:\nfor(инициализация счетчика; условие; итерация) инструкция");
                    break;
                case '4':
                    System.out.println("Инструкция:\nwhile(условие) инструкция");
                    break;
                case '5':
                    System.out.println("Инструкция:\ndo(инструкция)\nwhile(условие)");
                    break;
                case '6':
                    System.out.println("Инструкция:\nbreak или break метка)");
                    break;
                case '7':
                    System.out.println("Инструкция:\ncontinue или continue метка)");
                    break;
//            default:
//                System.out.println("Запрос не найден");
            }
        }
    }
}