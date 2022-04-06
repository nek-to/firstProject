package shildt.title_10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class MainReader {

    public static void main(String[] args) throws IOException {
        String fileName = args[0];
        File file = new File(fileName);
        BufferedReader fileReader = new BufferedReader(new FileReader(file));

        String message = "";
        while ((message = fileReader.readLine()) != null) {
            System.out.println(message);

        }
    }
}
