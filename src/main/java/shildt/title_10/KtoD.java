package shildt.title_10;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class KtoD {
    public static void main(String[] args) throws IOException {
        String str;
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Признак конца ввода - строка 'stop'");

        try(FileWriter fw = new FileWriter("test.txt")){
            do {
                System.out.print(": ");
                str = bfr.readLine();
                if (str.compareTo("stop") == 0) break;
                str += "\r\n";
                fw.write(str);
            }while (str.compareTo("stop") != 0);
        }
    }
}
