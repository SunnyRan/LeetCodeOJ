package com.sunny;

public class Transpose_867 {
//    public int[][] transpose(int[][] matrix) {
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = i; j <matrix[i].length ; j++) {
//                int temp = matrix[i][j];
//                matrix[i][j] = matrix[j][i];
//                matrix[j][i] = temp;
//            }
//        }
//        return matrix;
//    }


    public int[][] transpose(int[][] matrix) {
        int[][] re = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j <matrix[i].length ; j++) {
                re[j][i] = matrix[i][j];
            }
        }
        return re;
    }
}
