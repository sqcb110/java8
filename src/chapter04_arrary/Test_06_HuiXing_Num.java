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
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 1){
                    arr[i][j] = j+1;
                }else if()
            }
        }
    }
}
