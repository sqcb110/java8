package chapter04_arrary;

/*
（1）在编程竞赛中，有10位评委为参赛的选手打分，分数分别为：5，4，6，8，9，0，1，2，7，3
（2）求选手的最后得分（去掉一个最高分和一个最低分后其余8位评委打分的平均值）
*/

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
