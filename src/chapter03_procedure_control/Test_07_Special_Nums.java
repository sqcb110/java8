package chapter03_procedure_control;

/*打印1~100之间所有是7的倍数的整数的个数及总和（体会设置计数器的思想）*/

public class Test_07_Special_Nums {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        for (int i = 1; i < 101; i++) {
            if (i%7==0){
                count++;
                sum+=i;
            }
        }
        System.out.println("个数为："+count);
        System.out.println("和为："+sum);
    }
}
