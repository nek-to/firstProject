package shildt.title_3;

import java.io.IOException;
// Приложение, выдающее инструкцию выполнения функций if и switch
public class IfSwitchExr {
    public static void main(String[] args) throws IOException {
        System.out.println("Справка:\n\t1. if\n\t2. switch\nВыберите...");
        char input = (char) System.in.read(); // спросить почему необходим кастинг до char.

        switch (input){
            case '1':
                System.out.println("Инструкция:\nif(условие) инструкция\nelse инструкция");
                break;
            case '2':
                System.out.println("Инструкция\nswitch(выражение)\ncase: константа\n\tинструкция\ncase n: константа\n\tинструкция\ndefault: инструкция");
                break;
            default:
                System.out.println("Запрос не найден");
        }
    }
}
