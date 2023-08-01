package chapter04_arrary;

//二分法查找：要求此数组必须是有序的。

import java.util.Scanner;

public class Test_11_Binary_Search {
    public static void main(String[] args) {
        int[] arr = {125,150,202,304,316,325,450,740};
        boolean flag = true;
        int start = 0;
        int end = arr.length - 1;
        int index = -1;

        //要查找的数：
        System.out.println("请输入要查找的数：");
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();

        while(start < end){
            if (value == arr[(start+end)/2]){
                index = (start+end)/2;
                System.out.println("你要找的值的索引是：" + index);
                break;
            }else if(value < arr[(start+end)/2]){
                end = (start+end)/2;
            }else {
                start = (start+end)/2;
            }

            if(end - start <= 1){
                System.out.println("无此值");
                break;
            }
        }

    }
}
