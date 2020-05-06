package chapter1_1;

public class Example_22 {
    public static int rank(int key, int[] a) {
        return rank(key, a, 0, a.length - 1, 0);
    }

    private static int rank(int key, int[] a, int lo, int hi, int depth) {
        //保存递归的深度，进行缩进操作
        for (int i = 0; i < depth; i++) {
            System.out.print(" ");
        }
        System.out.println("lo=" + lo + ", hi=" + hi);

        if (lo > hi) {
            return -1;
        }
        int mid = lo+(hi - lo) / 2;
        if (key < a[mid]) {
            return rank(key, a, lo, mid - 1, depth + 1);
        } else if ((key > a[mid])) {
            return rank(key, a, mid + 1, hi, depth + 1);
        } else {
            return mid;
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 9, 10, 18, 20};
        int key = 18;
        int result = rank(key, a);
        if (result == -1) {
            System.out.println("not found");
        } else {
            System.out.println("result = " + result);
        }
    }
}
