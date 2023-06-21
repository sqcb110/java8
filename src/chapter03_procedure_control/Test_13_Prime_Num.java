package chapter03_procedure_control;

/***题目：找出100以内所有的素数（质数）？100000以内的呢？**
 目的：不同的代码的实现方式，可以效率差别很大。
分析：素数（质数）：只能被1和它本身整除的自然数。  ---> 从2开始，到这个数-1为止，此范围内没有这个数的约数。则此数是一个质数。
比如：2、3、5、7、11、13、17、19、23、...*/

public class Test_13_Prime_Num {
    public static void main(String[] args) {
        int count = 0;
        long start = System.currentTimeMillis();
        t:for (int i = 2; i < 10000000; i++) {
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if(i%j == 0 ){
                    continue t;
                }
            }
            count++;
            //System.out.println(i);
        }



/*        for (int i = 2; i < 100000; i++) {
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if( i % j == 0){
                    flag = false;
                }
            }
            if(flag){count++;}
        }*/

        long end = System.currentTimeMillis();
        System.out.println("素数的个数为：" + count);
        System.out.println(end-start);
    }
}
