package shildt.title_5;

/**
 * Расширьте класс Encode таким образом, чтобы в качестве ключа шифрования использовалась
 * строка из восьми символов.
 */
public class Encode {
    public static void main(String[] args) {
        String strings = "Just simple text";
        String encoder = "";
        String decoder = "";
        String key = "cesarius";
        int roll;

        System.out.println("Исходное сообщение: " + strings);

        roll = 0;
        for (int i = 0; i < strings.length(); i++) {
            encoder = encoder + (char) (strings.charAt(i) ^ key.charAt(roll));
            roll++;
            if (roll == 8) roll = 0;
        }
        System.out.print("Зашифрованное сообщение: ");
        System.out.println(encoder);

        roll = 0;
        for (int i = 0; i < encoder.length(); i++) {
            decoder = decoder + (char) (encoder.charAt(i) ^ key.charAt(roll));
            roll++;
            if (roll == 8) roll = 0;
        }
        System.out.println("Расшифрованное сообщение: " + decoder);
    }
}
