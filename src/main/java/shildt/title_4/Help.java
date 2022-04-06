package shildt.title_4;

public class Help {
    void helpOn(int input) {
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
        }
        System.out.println();
    }

    void showMenu() {
        System.out.println("Справка:\n\t1. if\n\t2. switch\n\t3. for\n\t4. while\n\t5. do-while\n\t6. break\n\t7. continue\n Выберите q для выхода...");
    }

    boolean isValid(int ch) {
        if (ch < '1' | ch > '7' & ch != 'q') return false;
        else return true;
    }
}
