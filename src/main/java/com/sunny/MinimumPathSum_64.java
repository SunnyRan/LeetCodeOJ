package com.sunny;

import java.util.Map;

/**
 * @program: LeetCodeOJ
 * @description:
 * @author: Arnold
 * @create: 2019-06-12 20:00
 **/
public class MinimumPathSum_64 {


    public int minPathSum(int[][] grid) {
        int iMax = grid.length;
        int jMax = grid[0].length;
        for(int i =0 ;i<iMax;i++){
            for (int j =0;j<jMax;j++){
                //第一行处理
                if(i == 0 ){
                    if(j>0) {
                        grid[i][j] = grid[i][j] + grid[i][j - 1];
                    }
                }
                //非第一行处理
                if(i>0){
                    if(j == 0){
                        grid[i][j] = grid[i][j] + grid[i-1][j];
                    }else{
                        grid[i][j] = grid[i][j] + Math.min(grid[i-1][j],grid[i][j-1]);
                    }
                }
            }
        }
        return grid[iMax-1][jMax-1];
    }


    public static void main(String[] args) {
        int[][] grid = new int[][]{{1,3,1},{1,5,1},{4,2,1}};
        System.out.println(new MinimumPathSum_64().minPathSum(grid));
    }
}
