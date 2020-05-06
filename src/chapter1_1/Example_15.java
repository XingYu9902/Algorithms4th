package chapter1_1;

public class Example_15 {
    public static void main(String[] args) {
        int[] a = {1, 2, 1, 2, 3, 4, 5, 6, 7, 7};
        int[] result = histogram(a, 8);
        for (int i = 0; i < result.length; i++) {
            System.out.println(i + ":" + result[i]);
        }
    }

    private static int[] histogram(int[] a, int m) {
        int[] result = new int[m];
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= 0 && a[i] < m) {
                result[a[i]]++;
            }
        }
        return result;
    }
    /*
        输出结果：
                0:0
                1:2
                2:2
                3:1
                4:1
                5:1
                6:1
                7:2
     */
}
