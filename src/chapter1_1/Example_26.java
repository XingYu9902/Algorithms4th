package chapter1_1;

import edu.princeton.cs.algs4.StdIn;

public class Example_26 {
    public static void main(String[] args) {
        int a = StdIn.readInt();
        int b = StdIn.readInt();
        int c = StdIn.readInt();
        int t;

        if (a > b){
            t = a;
            a = b;
            b = t;
        }
        if (a > c){
            t = a;
            a = c;
            c = t;
        }
        if (b > c){
            t = b;
            b = c;
            c = t;
        }

        System.out.println("abc按照升序排列的结果："+a+" "+b+" "+c);
    }
    /*
        532
        221
        211
        abc按照升序排列的结果：211 221 532
     */
}
