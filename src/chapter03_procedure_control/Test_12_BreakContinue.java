package chapter03_procedure_control;

public class Test_12_BreakContinue {
    public static void main(String[] args) {
        tag:for (int i = 1; i < 4; i++) {
            for (int j = 1; j < 10; j++) {
                if (j%4==0){
                    //break tag;
                    continue tag;
                }
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
