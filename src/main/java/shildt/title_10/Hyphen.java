package shildt.title_10;

import java.io.*;

public class Hyphen {
    public static void main(String[] args) throws IOException {
        int i;
        FileInputStream fin = null;
        FileOutputStream fout = null;

        if (args.length != 2){
            System.out.println("Использование: Hyphen откуда куда");
            return;
        }
        fin = new FileInputStream(args[0]);
        fout = new FileOutputStream(args[1]);

        do {
            i = fin.read();
            if ((char)i == ' ') i = '-';
            if (i != -1) fout.write(i);
        }while (i != -1);
        fin.close();
        fout.close();
    }
}
