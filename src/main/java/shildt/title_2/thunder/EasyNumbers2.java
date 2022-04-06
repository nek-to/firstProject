package shildt.title_2.thunder;

/**
 * Напишите программу, которая находила бы все простые числа в диапазоне от 2 до 100.
 * Другими словами, число x является простым, если оно больше 1 и при этом делится без остатка только на 1 и на x. К примеру, 5.
 */
public class EasyNumbers2 {
    public static void main(String args [ ])
    {
        int i,j;

        for (i=2;i<100;i++){
            int k=0;

            for (j=2;j<=i;j++) {
                if ((i%j) == 0)
                    k++;
            }

            if (k<2) {
                System.out.println(i);
            }
        }
    }
}