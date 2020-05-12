package chapter1_1;

import edu.princeton.cs.algs4.BinarySearch;
import edu.princeton.cs.algs4.StdIn;

import java.util.ArrayList;
import java.util.Arrays;

/*
    二分查找删除重复元素
 */
public class Example_28 {
    public static void main(String[] args) {
        int[] list = {1, 6, 5, 3, 9, 6, 3, 7, 4, 1};

        //先排序
        Arrays.sort(list);
        ArrayList<Integer> arrayList = new ArrayList();
        for (int i = 0; i < list.length - 1; i++){
            //这里会和最后一个元素进行比较，i最大不能是list.lenth-1
            if (list[i] != list[i+1]){
                //重复元素不会被添加
                arrayList.add(list[i]);
            }
        }
        //添加最后一个元素
        arrayList.add(list[list.length-1]);
        /*
            这里需要将ArrayList集合的元素转移到数组中
            因为使用BinarySearch类中的indexOf方法需要的参数是一个数组和key
         */
        list = new int[arrayList.size()];
        for (int i = 0; i<list.length;i++){
            list[i] = arrayList.get(i);
            System.out.print(list[i]+" ");
        }
        System.out.println();
        System.out.println(BinarySearch.indexOf(list, StdIn.readInt()));
    }
}
