package chapter03_procedure_control;

/*随机生成一个100以内的数，猜这个随机数是多少？
从键盘输入数，如果大了，提示大了；如果小了，提示小了；如果对了，就不再猜了，并统计一共猜了多少次。*/

import java.util.Scanner;

public class Test_09_Guess_Num {
    public static void main(String[] args) {
        //生成随机数
        int random = (int) (Math.random() * 100) + 1;
        Scanner scanner = new Scanner(System.in);
        int max = 100;
        int min = 1;

        //请输入猜的数
        System.out.println("请输入你猜的数：");
        int guess = scanner.nextInt();

        //猜的次数，计数
        int count = 1;

        //看看猜得对不对，不对的话继续猜，直到猜中
        if (guess == random){
            System.out.println("恭喜你，猜对了");
        }else{
            while(guess != random) {
                if (guess < random){
                    System.out.println("你猜的是："+ guess +"，不好意思，猜小了");
                    min = guess;
                    guess = (guess + max)/2;
                } else {
                    System.out.println("你猜的是："+ guess +"，不好意思，猜大了");
                    max = guess;
                    guess = (guess + min)/2;
                }
                count++;
            }
            if (guess == random){
                System.out.println("恭喜你猜对了！");
            }
        }
        System.out.println("随机数是："+random+"，猜了"+count+"次");
        scanner.close();

    }
}
