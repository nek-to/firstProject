package shildt.title_10;

import java.io.*;

public class Hyphen2 {
    public static void main(String[] args) throws IOException {
        int i;

        FileReader fin = new FileReader(args[0]);
        FileWriter fout = new FileWriter(args[1]);

        do {
            i = fin.read();
            if ((char) i == ' ') i = '-';
            if (i != -1) fout.write(i);
        } while (i != -1);
        fin.close();
        fout.close();
    }
}
