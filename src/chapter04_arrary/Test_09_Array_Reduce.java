package chapter04_arrary;

/*
数组缩容
现有数组 int[] arr={1,2,3,4,5,6,7}。现需删除数组中索引为4的元素。
*/

public class Test_09_Array_Reduce {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int delIndex = 4;
        //方案一，创建新数组，略，同数据扩容。

        //方案二，直接删除
        for (int i = delIndex; i < arr.length-1; i++) {
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = 0;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
