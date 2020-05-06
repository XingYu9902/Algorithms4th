package chapter1_1;

import edu.princeton.cs.algs4.StdOut;

/*
    编写一个递归的静态方法计算ln(N!)的值。
        根据对数公式，ln(MN) = lnM + lnN
                     ln(3!) = ln3 + ln2! = ln3+ln2+ln1;
 */
public class Example_20 {
    public static void main(String[] args) {
        StdOut.println(ln(3));
    }
    private static double ln(int i) {
        if (i==1){
            return 0;
        }else {
            return Math.log(i)+ln(i-1);
        }
    }
}
