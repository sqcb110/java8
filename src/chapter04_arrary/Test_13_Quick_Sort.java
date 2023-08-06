package chapter04_arrary;

/*
案例：使用快速排序，实现整型数组元素的排序操作
比如：int[] data = { 9, -16, 30, 23, -30, -49, 25, 21, 30 };
*/

import java.util.HashSet;
import java.util.Scanner;

public class Test_13_Quick_Sort {
    public static void main(String[] args) {
        int[] data1 = {9, -16, 30, 23, -30, -49, 25, 21, 30};

        //生成长度为10000000的数组，且没有重复值。
        Scanner sc = new Scanner(System.in);
        int[] data2 = new int[10000000];
        HashSet<Integer> hashSet = new HashSet<>(10000000);
        while (hashSet.size() < 10000000) {
            int a = sc.nextInt();
            int size = hashSet.size();
            hashSet.add(a);
            data2[size - 1] = a;
        }

        //data2 排序：
        long begin = System.currentTimeMillis();
        sortArray(data2);
        long stop = System.currentTimeMillis();

        System.out.println((stop-begin)/1000);
        //data2排序后：
/*        for (int i = 0; i < data1.length; i++) {
            System.out.print(data1[i] + " ");
        }*/

    }

    public static void sortArray(int[] arr){
        subSortArray(arr,0,arr.length-1);
    }

    private static void subSortArray(int[] arr,int start,int end){
        if(start < end) {
            int base = arr[start];
            int low = start + 1;
            int high = end;
            while(low < high) {
                while (arr[low] < base && low < end) {
                    low++;
                }
                while (arr[high] > base && high > start) {
                    high--;
                }
                if (low < high) {
                    swap(arr, low, high);
                }
            }
            swap(arr,start,high);
            subSortArray(arr,start,high -1 );
            subSortArray(arr,high + 1,end);
        }
    }

    private static void swap(int[] arr,int a,int b){
        if(a < arr.length && b < arr.length && a > -1 && b > -1) {
            int tmp;
            tmp = arr[a];
            arr[a] = arr[b];
            arr[b] = tmp;
        }
    }
}
