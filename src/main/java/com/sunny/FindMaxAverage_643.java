package com.sunny;

public class FindMaxAverage_643 {
    public double findMaxAverage(int[] nums, int k) {
        double max = Double.MIN_EXPONENT;
        int current = 0;
        double k1 = k;
        for (int i = 0; i < nums.length ; i++) {
            current += nums[i];
            if(i >= k){
                current -= nums[i-k];
            }
            if(i + 1 >= k){
                max = current/k1  > max ?  current/k1 : max;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        FindMaxAverage_643 demo = new FindMaxAverage_643();
        System.out.println(demo.findMaxAverage(new int[]{1,12,-5,-6,50,3},4));
        System.out.println(demo.findMaxAverage(new int[]{-1},1));
    }
}
