package chapter1_1;

public class Example_24 {
    public static int Euclid(int p, int q) {
        System.out.println("p = " + p + " q = " + q);

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
        System.out.println("105和24的最大公约数是："+Euclid(105,24));
        System.out.println("1111111和1234567的最大公约数是："+Euclid(1111111,1234567));
    }
    /*
        p = 105 q = 24
        p = 24 q = 9
        p = 9 q = 6
        p = 6 q = 3
        105和24的最大公约数是：3
        p = 1111111 q = 1234567
        p = 1111111 q = 123456
        p = 123456 q = 7
        p = 7 q = 4
        p = 4 q = 3
        p = 3 q = 1
        1111111和1234567的最大公约数是：1
     */
}
