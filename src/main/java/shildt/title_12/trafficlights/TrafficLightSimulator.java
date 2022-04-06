package shildt.title_12.trafficlights;

public class TrafficLightSimulator implements Runnable {
    private TrafficLightColor tlc;
    boolean stop = false;
    boolean changed = false;

    public TrafficLightSimulator(TrafficLightColor tlc) {
        this.tlc = tlc;
    }

    public TrafficLightSimulator() {
        tlc = TrafficLightColor.RED;
    }

    @Override
    public void run() {
        while (!stop) {
            try {
               Thread.sleep(tlc.getDelay());
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            changedColor();
        }
    }

    synchronized void changedColor() {
        switch (tlc) {
            case RED:
                tlc = TrafficLightColor.GREEN;
                break;
            case YELLOW:
                tlc = TrafficLightColor.RED;
                break;
            case GREEN:
                tlc = TrafficLightColor.YELLOW;
        }
        changed = true;
        notify();
    }

    synchronized void waitForChange() {
        try {
            while (!changed) wait();
            changed = false;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized TrafficLightColor getColor(){
        return tlc;
    }

    synchronized void clean(){
        stop = true;
    }
}