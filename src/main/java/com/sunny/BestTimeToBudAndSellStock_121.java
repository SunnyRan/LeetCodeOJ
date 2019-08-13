package com.sunny;

/**
 * @program: LeetCodeOJ
 * @description:
 * @author: Arnold
 * @create: 2019-04-09 09:59
 * <p>
 * <p>
 * Input: [7,1,5,3,6,4]
 * Output: 5
 * Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
 * Not 7-1 = 6, as selling price needs to be larger than buying price.
 * Example 2:
 * <p>
 * Input: [7,6,4,3,1]
 * Output: 0
 * Explanation: In this case, no transaction is done, i.e. max profit = 0.
 **/
public class BestTimeToBudAndSellStock_121 {

    public int maxProfit(int[] prices) {
        if (prices.length < 1) {
            return 0;
        }
        int max = 0;
        int min = prices[0];
        for (int i = 0; i < prices.length - 1; i++) {
            min = Math.min(min, prices[i]);
            max = Math.max((prices[i + 1] - min),max);
        }
        return max;
    }


    public static void main(String[] args) {
        BestTimeToBudAndSellStock_121 sellStock_121 = new BestTimeToBudAndSellStock_121();
        int [] array = new int[]{7,6,4,3,1};
        System.out.println(sellStock_121.maxProfit(array));
    }
}
