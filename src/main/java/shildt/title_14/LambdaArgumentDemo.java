package shildt.title_14;

public class LambdaArgumentDemo {
    static String changeString(StringFunc sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {
        String strIn = "Лямбда-выражения расширяют Java";
        String strOut;

        System.out.println("Входная строка " + strIn);

        strOut = changeString((str) -> str.replace(' ', '\0'), strIn);
        System.out.println(strOut);
    }

    ;
}

