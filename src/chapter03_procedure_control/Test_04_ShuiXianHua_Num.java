package chapter03_procedure_control;

/*题目：输出所有的水仙花数，所谓水仙花数是指一个3位数，其各个位上数字立方和等于其本身。例如： `153 = 1*1*1 + 3*3*3 + 5*5*5`*/

public class Test_04_ShuiXianHua_Num {
    public static void main(String[] args) {
        int cnt = 0;

        for (int i = 100; i < 1000; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100;
            if(i == bai*bai*bai + shi*shi*shi + ge*ge*ge){
                cnt++;
            }
        }

        System.out.println("水仙花数的个数为：" + cnt);
    }
}
