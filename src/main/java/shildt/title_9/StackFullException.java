package shildt.title_9;

/**
 * Отвечая на вопрос 3 в конце главы 6, вы создали класс Stack.
 * Добавьте в него пользовательские исключения, чтобы программа нужным образом реагировала
 * на попытку поместить элемент в заполненный стек или извлечь элемент из пустого стека.
 */
//Исключение , возникающее при переполнении стека
public class StackFullException extends Exception {
    int size;

    public StackFullException(int s) {
        size = s;
    }

    public String toString() {
        return "\nСтек заполнен. Максимальный размер стека: " + size;
    }
}