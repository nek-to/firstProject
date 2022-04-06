package shildt.title_8.exer8_1;

public class FixedQueue implements ICharQ {
    private char q[];
    private int putloc, getloc;

    public FixedQueue(int size) {
        q = new char[size];
        putloc = getloc = 0;
    }

    public void put(char ch){
        if (putloc == q.length){
            System.out.println(" - Очередь заполнена");
            return;
        }
        q[putloc++] = ch;
    }
    public char get(){
        if(putloc == getloc){
            System.out.println("- Очередь пуста");
            return (char) 0;
        }
        return q[getloc++];
    }

}
