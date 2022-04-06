package shildt.title_1.galons;

public class ModifiedConverter {
    public static void main(String[] args) {
        double gallons;
        double liters;
        int counter = 1;

        for (gallons = 1; gallons < 101; gallons++) {
            liters = gallons * 3.7854;
            System.out.println(gallons + " gallons = " + liters + " litters");
            if (counter == 10){
                System.out.println();
                counter = 0;
            } counter++;
        }
    }
}
