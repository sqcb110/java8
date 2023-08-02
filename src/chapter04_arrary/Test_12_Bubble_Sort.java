package chapter04_arrary;

public class Test_12_Bubble_Sort {
    public static void main(String[] args) {
        int[] arr = {450,150,325,202,304,316,125,740};
        int tmp = 0;
        boolean flag = true;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j+1]){
                    tmp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = tmp;
                    flag = false;
                }
            }
            if (flag) break; //如果元素发生了交换，则说明数组还没有排好序。
        }
        //排序后遍历数组：
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if(i< arr.length-1) System.out.print(",");
        }
    }
}
