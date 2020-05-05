package chapter1_1;

import edu.princeton.cs.algs4.StdIn;

public class Example_09 {
    public static void main(String[] args) {
        String s = "";
        int N = StdIn.readInt();
        for (int n = N; n > 0; n /= 2) {
            s = n % 2 + s;
        }
        System.out.println(s);
    }
}
