package shildt.title_6;

/**
 * Создайте класс Stack, реализующий стек для хранения символов. Используйте методы push ( ) и рор ( ) для манипулирования содержимым стека.
 * Пользователь класса Stack должен иметь возможность задавать размер стека при его создании.
 * Все члены класса Stack, кроме методов push ( ) и рор ( ) , должны быть объявлены как private.
 * (Подсказка: в качестве заготовки можете воспользоваться классом Queue, изменив в нем лишь способ доступа к данным.)
 */
public class Stack {
    private int mas[];
    private int pushLoc, popLoc;

    public Stack(int size) {
        mas = new int[size];
        pushLoc = popLoc = 0;
    }

    public int push(int num) {
        if (pushLoc == mas.length) {
            System.out.println("Стек заполнен.");
        }
        mas[pushLoc++] = num;
        return num;
    }

    public int pop() {
        if (popLoc == pushLoc) {
            System.out.println("Стек пуст.");
        }
        return mas[mas.length-1];
    }
}
