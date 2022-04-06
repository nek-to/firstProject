package shildt.title_6;

public class CallByValue {
    public static void main(String[] args) {
        Test test = new Test();

        int a = 15, b = 20;

        System.out.println(a + " " + b);

        test.noChange(a, b);
        System.out.println(a + " " + b);
    }
}
