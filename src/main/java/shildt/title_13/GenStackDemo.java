package shildt.title_13;

import shildt.title_9.StackFullException;

public class GenStackDemo {
    public static void main(String[] args) {
        //создать пустой стек на 10 элементов типа Integer
        Integer[] iStore = new Integer[10];
        GenStack<Integer> genIStack = new GenStack<Integer>(iStore);

        //создать стек из массива
        String[] name = {"Один", "Два", "Три"};
        String[] sStore = new String[3];
        GenStack<String> genSStack = new GenStack<String>(sStore, name);

        String str;
        int n;

        try {
            //занести ряд значений в стек genIStack
            for (int i = 0; i < 10; i++) {
                genIStack.push(i);
            }
        } catch (StackFullException e) {
            e.printStackTrace();
        }
        //создать один стек на основе другого
        String[] sStore2 = new String[3];
        GenStack<String> genSStack2 = new GenStack<String>(sStore2, genSStack);

        try {
            System.out.println("Содержимое genIStack: ");
            for (int i = 0; i < 10; i++) {
                n = genIStack.pop();
                System.out.println(n + " ");
            }
            System.out.println();

            System.out.println("Содержимое genSStack: ");
            for (int i = 0; i < 3; i++) {
                str = genSStack.pop();
                System.out.println(str + " ");
            }
            System.out.println();

            System.out.println("Содержимое genSStack2: ");
            for (int i = 0; i < 3; i++) {
                str = genSStack2.pop();
                System.out.println(str + " ");
            }
        } catch (StackEmptyException e) {
            e.printStackTrace();
        }
    }
}