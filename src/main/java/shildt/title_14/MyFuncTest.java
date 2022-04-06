package shildt.title_14;

public class MyFuncTest {
    public static void main(String[] args) {
        MyFunc<Integer> myFunc = (n) -> {
            int buf = n;
            if (n == 0) return 1;
            for (int i = n - 1; i > 0; i--){
                buf *= i;
            }
            return buf;
        } ;

        System.out.println(myFunc.func(10));
    }
}
