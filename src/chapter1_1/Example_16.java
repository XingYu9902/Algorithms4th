package chapter1_1;

public class Example_16 {
    public static void main(String[] args) {
        System.out.println(exR1(6));
    }

    private static String exR1(int i) {
        if (i<=0){
            return "";
        }else
            return exR1(i - 3) + i + exR1(i - 2) + i;
    }
}
