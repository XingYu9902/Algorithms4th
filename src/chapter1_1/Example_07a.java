package chapter1_1;

import edu.princeton.cs.algs4.StdOut;

public class Example_07a {
    public static void main(String[] args) {
        double t = 9.0;
        while (Math.abs(t - 9.0 / t) > .001) {
            t = (9.0 / t + t) / 2.0;
            StdOut.printf("%.5f\n", t);
        }
    }
    /*
        运行结果：
                5.00000
                3.40000
                3.02353
                3.00009
     */
}
