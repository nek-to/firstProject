package shildt.title_12.trafficlights;

public class TrafficLightDemo {
    public static void main(String[] args) {
        TrafficLightSimulator tls = new TrafficLightSimulator(TrafficLightColor.GREEN);

        Thread thread = new Thread(tls);
        thread.start();

        for (int i = 0; i < 10; i++) {
            System.out.println(tls.getColor());
            tls.waitForChange();
        }

        tls.clean();
    }
}
