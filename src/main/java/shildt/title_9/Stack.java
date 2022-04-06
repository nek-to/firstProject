package shildt.title_9;

public class Stack {
    private char stck[];
    private int tos;

    public Stack(int size) {
        stck = new char[size];
        tos = 0;
    }

    Stack(Stack ob) {
        tos = ob.tos;
        stck = new char[ob.stck.length];

        for (int i = 0; i < tos; i++) {
            stck[i] = ob.stck[i];
        }
    }

    Stack(char a[]) {
        stck = new char[a.length];

        for (int i = 0; i < a.length; i++) {
            try {
                push(a[i]);
            } catch (StackFullException exc) {
                System.out.println(exc);
            }
        }
    }

    void push(char ch) throws StackFullException {
        if (tos == stck.length) throw new StackFullException(stck.length);

        stck[tos] = ch;
        tos++;
    }

    char pop() throws StackEmptyException {
        if (tos == 0) throw new StackEmptyException();
        tos--;
        return stck[tos];
    }
}
