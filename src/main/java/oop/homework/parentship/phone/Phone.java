package oop.homework.parentship.phone;


public class Phone {
    private int number;
    private String model;
    private int weight;
    private String name;

    public void sendMessage(int... numbers){
        for (int a : numbers){
            System.out.print(a + " ");
        }
    }

    public Phone(int number, String model, int weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }

    public void receiveCall() {
        System.out.println("Звонит " + name);
    }

    public  void receiveCall(String name, int number) {
        this.name = name;
        this.number = number;
        System.out.println("Звонит " + name + "\n" + number);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number=" + number +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }
}
