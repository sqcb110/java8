package chapter03_procedure_control;

/*说明：输入两个正整数m和n，求其最大公约数和最小公倍数。*/

import java.util.Scanner;

public class Test_06_Special_Nums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字：");
        int m = sc.nextInt();
        int n = sc.nextInt();

        int gongyueshu = 1;
        int gongbeishu = 1;

        //求最大公约数
        for (int i = 1; i <= m && i <= n; i++) {
            if(m%i==0 && n%i==0){
                gongyueshu = i;
            }
        }

    }
}
