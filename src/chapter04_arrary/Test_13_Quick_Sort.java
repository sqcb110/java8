package chapter04_arrary;

/*
案例：使用快速排序，实现整型数组元素的排序操作
比如：int[] data = { 9, -16, 30, 23, -30, -49, 25, 21, 30 };
*/

import java.util.HashSet;

public class Test_13_Quick_Sort {
    public static void main(String[] args) {
        //int[] data1 = {9, -16, 30, 23, -30, -49, 25, 21, 30};

        //生成长度为10000000的数组，且没有重复值。
        System.out.println("开始生产数组data2");
        int[] data2 = new int[1000000];
        HashSet<Integer> hashSet = new HashSet<>(data2.length);
        while (hashSet.size() < data2.length) {
            int a =(int)(Math.random() * 10000000 + 1);
            if (!(hashSet.contains(a))) {
                hashSet.add(a);
                int size = hashSet.size();
                data2[size - 1] = a;
            }
        }
        System.out.println("数组data2生产结束");
        System.out.println("数组data2的长度为" + data2.length);
        //复制一个数组
        int[] data3 = new int[data2.length];
        System.out.println("开始复制生产data3");
        for (int i = 0; i < data2.length; i++) {
            data3[i] = data2[i];
        }
        System.out.println("data3生产结束");
        System.out.println("data3长度为：" + data3.length);
        //data2 排序：
        System.out.println("开始快排");
        long begin = System.currentTimeMillis();
        sortArray(data2);
        long stop = System.currentTimeMillis();
        System.out.println("快排结束");
        System.out.println("快排的耗时毫秒数为" + (stop-begin));

        //data3冒泡排序
        System.out.println("开始冒泡排序");
        long begin3 = System.currentTimeMillis();
        for (int i = 0; i < data3.length; i++) {
            for (int j = 0; j < data3.length - i - 1; j++) {
                int tmp;
                if (data3[j] > data3[j+1]){
                    tmp = data3[j];
                    data3[j] = data3[j+1];
                    data3[j+1] = tmp;
                }
            }
        }
        long end3 = System.currentTimeMillis();
        System.out.println("冒泡排序结束");
        System.out.println("冒泡排序的耗时毫秒数为：" + (end3 - begin3));
        //data1排序后：
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
