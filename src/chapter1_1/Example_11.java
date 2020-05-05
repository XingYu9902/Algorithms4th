package chapter1_1;

import edu.princeton.cs.algs4.StdOut;

public class Example_11 {
    public static void main(String[] args) {
        boolean[][] a = {{true,true,true},{false,true,false},{true,true,true}};

        printBooleanArrays(a);
    }

    private static void printBooleanArrays(boolean[][] arrays) {
        System.out.print(' ');
        for (int i=0;i<arrays.length;i++){
            StdOut.printf("%4d",i);
        }
        System.out.println();

        //行数
        for (int i =0;i<arrays.length;i++){
            System.out.print(i);
            //列数
            for (int j = 0;j<arrays.length;j++){
                StdOut.printf("%4s",arrays[i][j] ? '*':" ");
            }
            System.out.println();
        }
    }
    /*
        运行结果：
                0   1   2
                0   *   *   *
                1       *
                2   *   *   *
     */
}
