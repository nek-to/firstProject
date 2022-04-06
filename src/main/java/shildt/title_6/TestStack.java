package shildt.title_6;

public class TestStack {
    public static void main(String[] args) {
        Stack stack = new Stack(5);

        for (int i = 0; i < 5; i++) {
            System.out.println(stack.push(i));
        }

        System.out.println("---------------------");
        System.out.println(stack.pop());
    }
}
