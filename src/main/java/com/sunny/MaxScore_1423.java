package com.sunny;

public class MaxScore_1423 {
    public int maxScore(int[] cardPoints, int k) {
        int i = 0;
        int max = 0;
        int[][] temp = new int[2][k +1];
        for (; i <k; i++) {
            temp[0][i+1] = temp[0][i] + cardPoints[i];
            temp[1][i+1] = temp[1][i] + cardPoints[cardPoints.length - i -1];
        }
        for (int l = 0; l <=k ; l++) {
            max = Math.max(temp[0][l] + temp[1][k-l],max);
        }
        return max;
    }

    public static void main(String[] args) {
        MaxScore_1423 demo = new MaxScore_1423();

        System.out.println(demo.maxScore(new int[]{1,2,3,4,5,6,1},3));
        System.out.println(demo.maxScore(new int[]{2,2,2},2));
        System.out.println(demo.maxScore(new int[]{1,79,80,1,1,1,200,1},3));


    }
}
