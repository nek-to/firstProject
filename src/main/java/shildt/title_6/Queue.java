package shildt.title_6;

public class Queue {
    private char q[];
    private int putloc, getloc;

    Queue(int size) {
        q = new char[size];
        putloc = getloc = 0;
    }

    void put(char ch){
        if(putloc==q.length-1){
            System.out.println(" -  Очередь заполнена");
            return;
        }
        q[putloc++] = ch;
    }

    char get(){
        if (getloc == putloc){
            System.out.println("- Очередь пуста");
            return (char) 0;
        }
        return q[getloc++];
    }
}
