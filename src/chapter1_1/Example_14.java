package chapter1_1;

import edu.princeton.cs.algs4.StdIn;

/*
    编写一个静态方法lg(),接受一个整型参数N，返回不大于log2N的最大整数，不要使用Math库
        思路：
            以2为底的对数，也就是计算2的第几次平方。
            加入输入的整数为1025,log2(1025) = 比10大一点的数 所以返回的最大整数应该就是10; 也就是变成了怎么求这个10的过程
            以2为底很好计算，算术右移一次就是除以2
 */
public class Example_14 {
    public static void main(String[] args) {
        int N = StdIn.readInt();
        lg(N);
    }

    private static void lg(int n) {
        int shiftRightCount=0;  //定义算术右移次数的初始值

        while (n!=1){
            n >>=1;
            shiftRightCount++;
        }
        System.out.println(shiftRightCount);
    }
}
