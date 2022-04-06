package shildt.title_5;

public class Decoder {
    public static void main(String[] args) {
        String msg = "This is a test";
        String enmsg = "";
        String demsg = "";
        String key = "abcdefgi";
        int j;

        System.out.println("Massage: " + msg);

        j = 0;
        for (int i = 0; i < msg.length(); i++) {
            enmsg = enmsg + (char) (msg.charAt(i) ^ key.charAt(j));
            j++;
            if (j == 8) j = 0;
        }

        System.out.println("Code: " + enmsg);

        j = 0;
        for (int i = 0; i < msg.length(); i++) {
            demsg = demsg + (char) (enmsg.charAt(i) ^ key.charAt(j));
            j++;
            if (j == 8) j = 0;
        }
        System.out.println("Decode: " + demsg);
    }
}
