package com.sunny;

/**
 * @program: LeetCodeOJ
 * @description:
 * @author: Arnold
 * @create: 2019-04-09 10:50
 **/
public class BestTimeToBuyAndSellStock_122 {

    public int maxProfit(int[] prices) {
        int sum = 0;
        for(int i = 0;i <prices.length -1 ;i++){
            if(prices[i+1] - prices[i] >0 ){
                sum += prices[i+1] - prices[i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        BestTimeToBuyAndSellStock_122 sellStock_121 = new BestTimeToBuyAndSellStock_122();
        int [] array = new int[]{7,1,5,3,6,4};
        System.out.println(sellStock_121.maxProfit(array));
    }
}
