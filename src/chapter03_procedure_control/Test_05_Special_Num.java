package chapter03_procedure_control;

/*打印出四位数字中“个位+百位”等于“十位+千位”并且个位数为偶数，千位数为奇数的数字，并打印符合条件的数字的个数。*/

public class Test_05_Special_Num {
    public static void main(String[] args) {
        int cnt = 0;
        for (int i = 1000; i < 10000; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100 % 100;
            int qian = i / 1000;

            if((ge+bai)==(shi+qian) && ge%2 == 0 && qian%2 ==1){
                cnt++;
            }
        }
        System.out.println("个数为："+ cnt);
    }
}
