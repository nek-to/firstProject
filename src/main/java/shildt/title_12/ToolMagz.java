package shildt.title_12;

/**
 * Напишите для приведенного ниже перечисления программу,
 * в которой метод values () используется для отображения списка констант и их значений.
 */

public class ToolMagz {
    public static void main(String[] args) {
        System.out.println("Константы Tools: ");

        Tools[] tools = Tools.values();
        for (Tools tool : tools){
            System.out.println(tool);
        }
    }
}
