package shildt.title_6;

public class NewTest {
    int a, b;

    public NewTest(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void change(NewTest ob) {
        ob.a = ob.a + ob.b;
        ob.b = -ob.b;
    }
}
