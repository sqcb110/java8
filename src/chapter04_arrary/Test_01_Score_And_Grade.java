package chapter04_arrary;

/*从键盘读入学生成绩，找出最高分，并输出学生成绩等级。
成绩>=最高分-10  等级为’A’
成绩>=最高分-20  等级为’B’
成绩>=最高分-30  等级为’C’
其余            等级为’D’*/

import java.util.Scanner;

public class Test_01_Score_And_Grade {
    public static void main(String[] args) {
        //获取学生的人数
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入班级人数：");
        int count = scanner.nextInt();

        //创建数组，存放分数
        int[] scores = new int[count];

        //录入成绩
        int maxScore = 0;
        for (int i = 0; i < count; i++) {
            System.out.println("请录入第" + (i+1) + "位同学成绩：");
            scores[i] = scanner.nextInt();
            if(scores[i] > maxScore){
                maxScore = scores[i];
            }
        }

        //成绩分级
        char grade ;
        for (int i = 0; i < count; i++) {
            if (scores[i] >= maxScore - 10){
                grade = 'A';
            }else if (scores[i] >= maxScore - 20){
                grade = 'B';
            }else if(scores[i] >= maxScore - 30){
                grade = 'C';
            }else{
                grade = 'D';
            }
            System.out.println("分数为：" + scores[i] + "成绩为：" + grade);
        }

        //释放资源
        scanner.close();
    }
}
