package com.java;

/**
 * @program: LeetCodeOJ
 * @description:
 * @author: Arnold
 * @create: 2019-07-05 17:16
 **/
public class Demo_190705 {


    public static void main(String[] args) {

    }


    public void test(int[] x, int[] y){
        int i =0,j =0,I=x.length,J=y.length,n=0;

        while(i<I && j<J){
            System.out.print("第"+n+"次循环:");
            if(10 - x[i] > y[j]) {
                i++;
            }
            if(10 -x[i] < y[j]){
                j++;
            }
            if(10 -x[i] == y[j]) {
                return;
            }
        }
    }
}
