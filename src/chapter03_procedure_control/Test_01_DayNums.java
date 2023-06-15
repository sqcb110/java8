package chapter03_procedure_control;

/*从键盘分别输入年、月、日，判断这一天是当年的第几天

        注：判断一年是否是闰年的标准：
        1）可以被4整除，但不可被100整除
        或
        2）可以被400整除

        例如：1900，2200等能被4整除，但同时能被100整除，但不能被400整除，不是闰年*/

import java.util.Scanner;

public class Test_01_DayNums {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年份:");
        int year = sc.nextInt();

        System.out.println("请输入月份：");
        int month = sc.nextInt();

        System.out.println("请输入日期：");
        int day = sc.nextInt();

        





    }
}
