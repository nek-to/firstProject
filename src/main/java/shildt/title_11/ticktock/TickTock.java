package shildt.title_11.ticktock;

public class TickTock {
    String state;

    synchronized void tick(boolean running) {
        if (!running) { //остановить часы
            state = "ticked";
            notify(); //уведомить ожидающие потоки
            return;
        }
        System.out.print("Tick ");

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        state = "ticked"; //установить текущее состояние после такта "тик"

        notify(); // позволить выполняться методу tock()
        try {
            while (!state.equals("tocked")) wait(); // ожидать до завершения метода tock()
        } catch (InterruptedException e) {
            System.out.println("Прерывание потока");
        }
    }

    synchronized void tock(boolean running) {
        if (!running) { // остановить часы
            state = "tocked";
            notify();
            return;
        }
        System.out.println("Tock");

        state = "tocked";

        notify();
        try {
            while (!state.equals("ticked")) {
                wait();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}