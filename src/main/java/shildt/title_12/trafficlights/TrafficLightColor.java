package shildt.title_12.trafficlights;

public enum TrafficLightColor {
    GREEN(10000), YELLOW(2000), RED(12000);

    private int delay;

    TrafficLightColor(int d) {
        delay = d;
    }

    int getDelay(){
        return delay;
    }
}
