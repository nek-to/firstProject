package oop.homework.parentship.phone;

public class Tester {
    public static void main(String[] args) {
        Phone iphone = new Phone();
        iphone.setNumber(324152645);
        iphone.setModel("IPhone XS");
        iphone.setWeight(145);

        Phone samsung = new Phone();
        samsung.setNumber(345345377);
        samsung.setModel("Samsung S20");
        samsung.setWeight(176);

        Phone htc = new Phone();
        htc.setNumber(234535345);
        htc.setModel("HTC ZL30");
        htc.setWeight(340);

        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(htc);
        System.out.println();
        iphone.receiveCall();
        System.out.println(iphone.getNumber());
        samsung.receiveCall();
        System.out.println(samsung.getNumber());
        htc.receiveCall();
        System.out.println(htc.getNumber());
        System.out.println();
        iphone.receiveCall("Stive J", 133245345);
        System.out.println();
        iphone.sendMessage(324523542, 345235235, 235234532, 345234523);
    }
}
