package shildt.title_1.galons;

/**
 *  В галлоне содержится 3,7854 литра. Поэтому для преобразования галлонов в литры следует умножить число галлонов на 3,7854.
 *  В результате выполнения данной программы объем жидкости отображается как в галлонах, так и в литрах
 */
public class Converter {
    public static void main(String[] args) {
        double liter = 500;
        double gallon = liter / 3.7854;
        System.out.println(liter);
        System.out.println(gallon);
    }
}
