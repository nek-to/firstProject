package shildt.title_4;

import java.io.IOException;

public class HelpTest {
    public static void main(String[] args) throws IOException {
        char in, ignore;
        Help help = new Help();

        for (; ; ) {
            do {
                help.showMenu();
                in = (char) System.in.read();
                help.helpOn(in);
                do {
                    ignore = (char) System.in.read();
                } while (ignore != '\n');
            } while (!help.isValid(in));
            if (in == 'q') break;
            ;
        }
    }
}