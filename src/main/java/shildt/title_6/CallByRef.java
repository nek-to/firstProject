package shildt.title_6;

public class CallByRef {
    public static void main(String[] args) {
        NewTest newTest = new NewTest(15, 20);

        System.out.println(newTest.a + "" + newTest.b);

        newTest.change(newTest);
        System.out.println(newTest.a + "" + newTest.b);
    }
}
