package chapter1_1;

import edu.princeton.cs.algs4.StdIn;

/*
    编写一个程序，从命令行得到三个整数参数。如果它们都相等则打印equal，否则打印not equal。
 */
public class Example_03 {
    public static void main(String[] args) {
        int a = StdIn.readInt();
        int b = StdIn.readInt();
        int c = StdIn.readInt();

        if (a==b&&b==c){
            System.out.println("equal");
        }else {
            System.out.println("not equal");
        }
    }
    /*
        运行结果：
        5       1
        5       2
        5       3
        equal   not equal
     */
}
