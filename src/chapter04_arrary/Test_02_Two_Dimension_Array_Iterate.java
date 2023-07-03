package chapter04_arrary;

public class Test_02_Two_Dimension_Array_Iterate {
    public static void main(String[] args) {
        //存储3个小组的学员的成绩，分开存储，使用二维数组。
        int[][] scores = {
                {85,96,85,75},
                {99,96,74,72,75},
                {52,42,56,75}
        };

        //遍历二维数组
        for (int i = 0; i < scores.length; i++) {
            System.out.println("第" + (i + 1) + "组成绩如下：");
            for (int j = 0; j < scores[i].length; j++) {
                System.out.print(scores[i][j]);
                if (j < scores[i].length - 1){
                    System.out.print("，");
                }
            }
            if (i < scores.length - 1) {
                System.out.println();
            }
        }
    }
}
