package shildt.title_11.ticktock;

public class ThreadCom {
    public static void main(String[] args) {
        TickTock tickTock = new TickTock();
        MyThread mt1 = new MyThread("Tick", tickTock);
        MyThread mt2 = new MyThread("Tock", tickTock);

        try {
            mt1.thd.join();
            mt2.thd.join();
        } catch (InterruptedException e) {
            System.out.println("Прерывание основного потока");
        }
    }
}
