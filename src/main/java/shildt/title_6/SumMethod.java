package shildt.title_6;

/**
 * Создайте метод sum (), имеющий список аргументов переменной длины и предназначенный для суммирования передаваемых ему значений типа int.
 * Метод должен возвращать результат суммирования. Продемонстрируйте работу этого метода.
 */
public class SumMethod {
    int sum =0;
    public int sum(int ... v){
        for (int j : v) {
            sum += j;
        }
        return sum;
    }
}