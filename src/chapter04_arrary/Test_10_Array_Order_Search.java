package chapter04_arrary;

/*
* 数组的顺序查找
* 对数组元素的顺序没有要求
* */

public class Test_10_Array_Order_Search {
    public static void main(String[] args) {
        // todo 01 查找value第一次在数组中出现的index
        int[] arr = {4,5,6,7,8,9,1,10};
        int value = 1;
        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (value == arr[i]){
                index = i;
                break;
            }
        }

        System.out.println("value第一次在数组中出现的index是：" + index);
        
    }
}
