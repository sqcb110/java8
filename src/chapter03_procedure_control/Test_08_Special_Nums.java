package chapter03_procedure_control;

/*编写程序从1循环到150，并在每行打印一个值，
另外在每个3的倍数行上打印出“foo”,在每个5的倍数行上打印“biz”,在每个7的倍数行上打印输出“baz”。*/

public class Test_08_Special_Nums {
    public static void main(String[] args) {
        for (int i = 1; i < 151; i++) {
            if (i%3==0){
                System.out.println(i+" foo");
            }else if(i%5==0){
                System.out.println(i+" biz");
            }else if(i%7==0){
                System.out.println(i+" baz");
            }else{
                System.out.println(i);
            }
        }
    }
}
