package chapter03_procedure_control;

/*根据月份推断季节
* 3、4、5 春季
* 6、7、8 夏季
* 9、10、11 秋季
* 12、1、2 冬季
* */

import java.util.Scanner;

public class Test_02_Month_Season {
    public static void main(String[] args) {
        System.out.println("请输入月份：");
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();

        switch (month){
            case 3:
            case 4:
            case 5:
                System.out.println(month +"月是春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(month +"月是夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(month +"月是秋季");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println(month +"月是冬季");
        }

        sc.close();
    }
}
