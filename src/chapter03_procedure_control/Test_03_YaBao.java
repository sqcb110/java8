package chapter03_procedure_control;

/*
随机产生3个1-6的整数，如果三个数相等，那么称为“豹子”，
        如果三个数之和大于9，称为“大”，如果三个数之和小于等于9，称为“小”，
        用户从键盘输入押的是“豹子”、“大”、“小”，并判断是否猜对了
*/

import java.util.Scanner;

public class Test_03_YaBao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请押宝（豹子、大、小）：");
        String yabao = sc.nextLine();
        String jieguo = "";

        int a = (int)(Math.random()*6+1);
        int b = (int)(Math.random()*6+1);
        int c = (int)(Math.random()*6+1);

        if(a==b&&a==c){
            jieguo = "豹子";
        }else if((a+b+c) > 9){
            jieguo = "大";
        }else{
            jieguo = "小";
        }

        System.out.println("a是："+ a +"；b是："+ b +"；c是"+ c +"。和是："+ (a+b+c));

        if(yabao.equals(jieguo)){
            System.out.println("恭喜你押对了");
        }else{
            System.out.println("很遗憾你押错了");
        }
    }
}
