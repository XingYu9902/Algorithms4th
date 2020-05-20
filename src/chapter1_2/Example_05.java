package chapter1_2;

import edu.princeton.cs.algs4.StdOut;
/*
    以下代码会打印出什么？
 */
public class Example_05 {
    public static void main(String[] args) {
        String s = "Hello World";
//        s.toUpperCase();
//        s.substring(6,11);
//        StdOut.println(s);
        /*
        Hello World
        String对象是不可变的——所有字符串方法都会返回一个新的String对象。
        正确使用上述方法的代码：
     */
        s=s.toUpperCase();      //转换成大写
        s=s.substring(6,11);    //左闭右开
        StdOut.println(s);
        /*
            WORLD
         */
    }
}
