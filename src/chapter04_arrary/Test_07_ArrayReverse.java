package chapter04_arrary;

public class Test_07_ArrayReverse {
    public static void main(String[] args) {
        // todo 1 : 反转前：
        //int[] arr = {1,2,3,4,5};
        int[] arr = {1,2,3,4,5,6};
        System.out.println("反转之前：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();

        // todo 2 : 反转：
        int temp;
        for (int i = 0; i < arr.length/2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }

        // todo 3 ：反转后：
        System.out.println("反转之后：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();

    }
}
