package com.sunny;

import java.util.Arrays;
import java.util.List;
import java.util.SortedSet;
import java.util.Stack;

public class MedianSlidingWindow_480 {
    public double[] medianSlidingWindow(int[] nums, int k) {
        double[] result = new double[nums.length - k + 1];
        for (int i = 0; i <=nums.length - k; i++) {
            int[] sorted = Arrays.stream(nums).skip(i).limit(k).sorted().toArray();
            if(k%2 == 1){
                result[i] = sorted[k/2];
            }else {
                result[i] = sorted[k/2]/2.0 + sorted[k/2-1]/2.0 ;
            }
        }
        return result;
    }

    public double[] medianSlidingWindow2(int[] nums, int k) {
        double[] result = new double[nums.length - k + 1];
        int[] sorted = Arrays.stream(nums).limit(k).sorted().toArray();
        for (int i = 0; i <=nums.length - k; i++) {
            if(k%2 == 1){
                result[i] = sorted[k/2];
            }else {
                result[i] = sorted[k/2]/2.0 + sorted[k/2-1]/2.0 ;
            }
            if(i < nums.length -k){
                removeAndInsert(sorted,nums[i],nums[i + k]);
            }
        }
        return result;
    }

    public void removeAndInsert(int[] nums ,int remove, int insert){
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == remove){
                index = i;
            }
        }
        while (index<nums.length - 1 && insert > nums[index + 1]){
            nums[index] = nums[index + 1];
            index++;
        }
        while (index > 0 && insert < nums[index - 1]){
            nums[index] = nums[index - 1];
            index--;
        }
        nums[index] = insert;
    }


    public static void main(String[] args) {
        MedianSlidingWindow_480 demo = new MedianSlidingWindow_480();
        int[] nums = new int[]{1,2,3,4,2,3,1,4,2}; //
        int[] nums2 = new int[]{1,4,2,3};
        int[] nums3 = new int[]{2147483647,2147483647};

        double[] doubles = demo.medianSlidingWindow2(nums3, 2);
        System.out.println(Arrays.toString(doubles));
    }

}
