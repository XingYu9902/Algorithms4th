package chapter1_1;

import edu.princeton.cs.algs4.StdIn;

public class Example_18 {
    public static void main(String[] args) {
        int a = StdIn.readInt();
        int b = StdIn.readInt();
        System.out.println(mystery(a, b));
        System.out.println(mystery1(a, b));
        /*
                a:    2
                b:    25
                输出结果：
                      50
                      96
         */
    }

    private static int mystery(int a, int b) {
        if (b == 0) {
            return 0;
        }else if (b % 2 == 0) {
            return mystery(a + a, b / 2);
        } else {
            return mystery(a + a, b / 2) + a;
        }
    }
    private static int mystery1(int a, int b) {
        if (b == 0) {
            return 1;
        }else if (b % 2 == 0) {
            return mystery(a * a, b / 2);
        } else {
            return mystery(a * a, b / 2) * a;
        }
    }
}
