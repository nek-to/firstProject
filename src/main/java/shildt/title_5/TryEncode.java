package shildt.title_5;

public class TryEncode {
    public static void main(String[] args) {
        String msg = "New massage";
        String encode = "";
        String decode = "";
        int key = 88;

        System.out.println("Massage: " + msg);
        for (int i = 0; i < msg.length(); i++) {
            encode = encode + (char) (msg.charAt(i) ^ key);
        }
        System.out.println("Code massage: " + encode);

        for (int i = 0; i < encode.length(); i++) {
            decode = decode + (char) (encode.charAt(i) ^ key);
        }
        System.out.println("Decode message: " + decode);
    }
}
