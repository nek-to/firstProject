package shildt.title_11.ticktock;

public class MyThread implements Runnable {
    Thread thd;
    TickTock ttob;

    public MyThread(String name, TickTock ttob) {
        thd = new Thread(this, name);
        this.ttob = ttob;
    }

    public static MyThread createAndStart(String name, TickTock ttob) {
        MyThread myThread = new MyThread(name, ttob);

        myThread.thd.start();
        return myThread;
    }

    @Override
    public void run() {
        if (thd.getName().compareTo("Tick") == 0) {
            ttob.tick(true);
        } else {
            for (int i = 0; i < 5; i++) ttob.tock(true);
            ttob.tock(false);
        }
    }
}
