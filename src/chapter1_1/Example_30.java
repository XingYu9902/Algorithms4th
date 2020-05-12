package chapter1_1;

import edu.princeton.cs.algs4.StdIn;

/*
    互质：两个数的公约数 等于 1
 */
public class Example_30 {
    public static int Euclid(int p,int q){
        if (p == 0 || q == 0) {
            return 1;
        }

        if (p < q) {
            int t = p;
            p = q;
            q = t;
        }
        if (p % q ==0){
            return q;
        }else {
            return Euclid(q, p % q);
        }
    }
    public static void main(String[] args) {
        int n = StdIn.readInt();
        boolean[][] a = new boolean[n][n];
        for (int i = 0;i<n;i++){
            for (int j=0;j<n;j++){
                a[i][j] = Euclid(i,j)==1;
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
