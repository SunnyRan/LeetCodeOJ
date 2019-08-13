package com.sunny;

import java.util.Stack;

/**
 * @program: LeetCodeOJ
 * @description:
 * @author: Arnold
 * @create: 2019-06-19 18:54
 **/
public class TrappingRainWater_42 {


    public int trap(int[] height) {
        int start = 0,end =1,sum =0;
        Stack<Integer> stack = new Stack();
        while(end < height.length){
            if(height[start] > height[end]){
                stack.push(height[end]);
            }else{
                while(!stack.isEmpty()){
                    sum+= height[start] - stack.pop();
                }
                start = end;
            }
            end++;
            if(end == height.length && !stack.isEmpty()){
                int i = stack.pop();
                while(!stack.isEmpty()){
                     if(i-stack.peek()>0){
                         sum+=i-stack.peek();
                     }
                     i =Math.max(stack.pop(),i);
                }
            }
        }
        return sum;
    }


    public int trap2(int[] height) {
        int sum =0;
        int[][] max = new int[2][height.length];
        max[0][0] = height[0];
        max[1][height.length-1] = height[height.length-1];
        for(int i = 1;i< height.length;i++){
            max[0][i]= Math.max(max[0][i-1],height[i]);
            max[1][height.length - i] = Math.max(max[1][height.length],height[height.length - i]);
        }
        for(int i = 1;i<height.length-1;i++){
            int k = Math.min(max[0][i],max[1][i]) - height[i];
            if(k>0){
                sum+=k;
            }
        }
        return sum;
    }


    public static void main(String[] args) {
        TrappingRainWater_42 demo = new TrappingRainWater_42();

        //6
        int[] array = new int[]{0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(demo.trap2(array));

        //1
        int[] array2 = new int[]{4,2,3};
        System.out.println(demo.trap2(array2));


        //3
        int[] array3 = new int[]{2,1,0,2};
        System.out.println(demo.trap2(array3));

        //7
        int[] array4 = new int[]{0,7,1,4,6};
        System.out.println(demo.trap2(array4));
    }
}
