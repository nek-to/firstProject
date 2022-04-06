package shildt.title_9;
//Исключение , возникающее при обращении к пустому стеку
public class StackEmptyException extends Exception {
    @Override
    public String toString() {
        return "\nСтек пуст.";
    }
}
