package com.sunny;

public class MaxScore_1423 {
    public int maxScore(int[] cardPoints, int k) {
        int right =0,left = 0;
        int i = 0;
        int j = cardPoints.length - 1;
        for (; i < k; i++) {
            left += cardPoints[i];
        }
        for (; j >=0 ; j--) {
            right += cardPoints[j];
        }
        if(i >= j){
            return Math.max(right,left);
        }
        for (;k> 0;k--){

        }
    }
}
