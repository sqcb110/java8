package chapter04_arrary;

/*
从键盘输入一个整数（1~20） ，则以该数字为矩阵的大小，把1,2,3…n*n 的数字按照顺时针螺旋的形式填入其中。

例如： 输入数字2，则程序输出：
        1 2
        4 3
        输入数字3，则程序输出：
        1 2 3
        8 9 4
        7 6 5
        输入数字4， 则程序输出：
        1    2    3    4
        12   13   14   5
        11   16   15   6
        10   9    8    7
*/

import java.util.Scanner;

public class Test_06_HuiXing_Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //todo 1 ：请输入一个1～20的整数n，并初始化相应尺寸的数组：
        System.out.println("请舒入一个1～20的整数：");
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        //todo 2 ：计数器
        int count = 1;
        //todo 3 ：双层循环，外层n/2次：
        for (int i = 0; i < n/2; i++) {
            //todo 4 ：外层循环，4*n-4*(i+1)次
            //todo 4.1 :上循环
            for (int j = 0; j < n -2*i; j++) {
                arr[i][j+i] = count++;
                //count++;
            }
            //todo 4.2 右循环
            for (int j = 0; j < n - 2*(i+1); j++) {
                arr[j+i+1][n-i-1] = count++;
                //count++;
            }
            //todo 4.3 下循环
            for (int j = 0; j < n - 2*i; j++) {
                arr[n-1-i][n-1-i-j] = count++;
                //count++;
            }
            //todo 4.4 左循环
            for (int j = 0; j < n - 2*(i+1); j++) {
                arr[n-2-i-j][i] = count++;
                //count++;
            }
        }

        if (n%2 == 1){
            arr[(n-1)/2][(n-1)/2] = count;
        }else{
            count--;
        }

        //todo 5 遍历数组：
        System.out.println("回形数如下：");
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]);
                if (j < n - 1){
                    System.out.print("-");
                }else{
                    System.out.println();
                }
            }
        }
        System.out.println("n*n为：");
        System.out.println(count);
    }
}
