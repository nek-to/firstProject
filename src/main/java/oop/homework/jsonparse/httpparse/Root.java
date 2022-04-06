package oop.homework.jsonparse.httpparse;

import java.util.ArrayList;

public class Root {
    private ArrayList<Distances> distances;
    private String endTime;
    private String input;
    private String log;
    private String num;
    private String processTime;
    private String startTime;

    public ArrayList<Distances> getDistances() {
        return distances;
    }

    public void setDistances(ArrayList<Distances> distances) {
        this.distances = distances;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public String getLog() {
        return log;
    }

    public void setLog(String log) {
        this.log = log;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getProcessTime() {
        return processTime;
    }

    public void setProcessTime(String processTime) {
        this.processTime = processTime;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    @Override
    public String toString() {
        return "Root{" +
                "distances=" + distances +
                ", endTime='" + endTime + '\'' +
                ", input='" + input + '\'' +
                ", log='" + log + '\'' +
                ", num='" + num + '\'' +
                ", processTime='" + processTime + '\'' +
                ", startTime='" + startTime + '\'' +
                '}';
    }
}
