package chapter03_procedure_control;

/*打印菱形*/

public class Test_11_Diamond {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                if (i <= j + 4 && i <= 14 - j && i >= j - 4 && i >= 6- j){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
