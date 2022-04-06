package shildt.title_13;

public class StackFullException extends Exception {
    int size;

    public StackFullException(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Стек заполнен. Максимальный размер стека: " +
                size;
    }
}
