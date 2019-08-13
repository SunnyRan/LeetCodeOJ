package com.sunny;

/**
 * @program: LeetCodeOJ
 * @description:
 * @author: Arnold
 * @create: 2019-06-13 19:25
 **/
public class ScoreAfterFlippingMatrix_861 {

    public int matrixScore(int[][] A) {
        int row = A.length;
        int col = A[0].length;
        int current = 1<<(A[0].length-1);
        int sum =current * row;
        int k;
        for(int i = 1; i< col;i++){
            k = 0;
            current = current>>1;
            for(int j = 0;j<row;j++){
                if((A[j][0]^A[j][i]) == 1){
                    k++;
                }
            }
            k = Math.max(k,row - k);
            sum += current * k;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] array = new int[][]{{0,0,1,1},{1,0,1,0},{1,1,0,0}};
        System.out.println(new ScoreAfterFlippingMatrix_861().matrixScore(array));
    }
}
