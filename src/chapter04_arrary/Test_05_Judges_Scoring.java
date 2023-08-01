package chapter04_arrary;


public class Test_05_Judges_Scoring {
    public static void main(String[] args) {
        int[] scores = new int[]{5,4,6,8,9,0,1,2,7,3};

        int minScore = 0;
        int maxScore = 0;
        int sumScore = 0;
        for (int i = 0; i < scores.length; i++) {
            sumScore += scores[i];

            if (scores[i] > maxScore){
                maxScore = scores[i];
            }

            if (scores[i] < minScore){
                minScore = scores[i];
            }
        }

        System.out.println("总得分为：" + (sumScore - maxScore - minScore));
    }
}