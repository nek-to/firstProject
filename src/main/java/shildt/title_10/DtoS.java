package shildt.title_10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DtoS {
    public static void main(String[] args) throws IOException {
        String s;
        try (BufferedReader bfr = new BufferedReader(new FileReader("test.txt"))){
            while ((s = bfr.readLine()) != null){
                System.out.println(s);
            }
        }
    }
}
