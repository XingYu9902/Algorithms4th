package chapter1_1;

import java.util.Arrays;

/*
    rank：返回数组中小于key的元素数量
        考虑有重复元素的情况
 */
public class Example_29 {
    public static int rank(int key, int[] a) {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (a[mid] == key) {
                while (mid >= 0 && a[mid] == key) {
                    mid--;
                    /*
                        重复元素的判断，自身重复的元素不导致数量的增加
                     */
                }
                return mid+1;   //返回小于key的元素数量
            } else if (key < a[mid]) {
                hi = mid - 1;
            } else if (key > a[mid]) {
                lo = mid + 1;
            }
        }
        return -1;
    }

    /*
        count：
            返回数组中等于key的元素数量
            思路：利用rank方法，用rank中返回的mid值作为索引获取数组中的元素即是等于key的元素
            a[0] = 10;
            a[1] = 11;
            a[2] = 11;
            当key=11时，rank方法返回的值是1 , 从a[1]开始向后找，找到a[2]也等于11，此时count++;
     */
    public static int count(int key,int a[]){
        //利用rank方法如果key存在，则最少也要有一个等于key的元素
        int count = 1;
        int pos = rank(key,a);
        while (pos < a.length-1 && a[pos] == a[pos++]){
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] a = {84, 48, 68, 10, 18, 98, 12, 23, 54, 57, 33, 16, 77, 11, 29, 11, 29, 77, 77};
        Arrays.sort(a);
        System.out.println(rank(77,a));
        System.out.println(count(77,a));
    }
}
