package shildt.title_13;

import shildt.title_9.StackFullException;

public class GenStack<T> implements IGenStuck<T> {
    private T[] stck; //массив для хранения элементов стека
    private int tos; //вершина стека

    public GenStack(T[] stck) {
        this.stck = stck;
        tos = 0;
    }

    public GenStack(T[] stck, GenStack<T> ob) {
        tos = ob.tos;
        this.stck = stck;
        try {
            if (stck.length < ob.stck.length)
                throw new shildt.title_13.StackFullException(stck.length);
        } catch (shildt.title_13.StackFullException e) {
            e.printStackTrace();
        }

        //скопировать элементы
        for (int i = 0; i < tos; i++) {
            stck[i] = ob.stck[i];
        }
    }

    public GenStack(T[] stck, T[] a) {
        this.stck = stck;

        for (int i = 0; i < a.length; i++) {
            try {
                push(a[i]);
            } catch (StackFullException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void push(T ob) throws StackFullException {
        if (tos==stck.length) throw new StackFullException(stck.length);

        stck[tos] = ob;
        tos++;
    }

    @Override
    public T pop() throws StackEmptyException {
        if (tos == 0) throw new StackEmptyException();
        tos--;
        return stck[tos];
    }
}
