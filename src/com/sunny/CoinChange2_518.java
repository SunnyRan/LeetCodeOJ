package com.sunny;
import java.util.Arrays;
/**
 * Created by sunny.su on 2017/3/7.
 */
public class CoinChange2_518 {

    public static void main(String[] args) {
        CoinChange2_518 cc = new CoinChange2_518();
        int[] ar1 = {1,2,5};
        int re = cc.change2(  10, ar1);
        System.out.printf(String.valueOf(re));

    }

    public int total = 0;
    public int change(int amount, int[] coins) {
        if(amount == 0 )return 1;
        getChange(amount, coins, coins.length - 1);
        return total;
    }

    public void getChange(int amount, int[] coins, int star) {
        if (star < 0) return;
        if (amount - coins[star] == 0) total++;
        if (amount - coins[star] > 0)
        {
            getChange(amount - coins[star], coins, star);
        }
        getChange(amount, coins, --star);
    }


    ///////////////////////////////////////////////////////////////////////////////////////

    public int change2(int amount, int[] coins) {
        int [] dp = new int[amount+1];
        dp[0] =1;
        for(int coin:coins){
            for(int i = 1;i<=amount;i++){
                if(i>=coin)dp[i]+=dp[i-coin];
            }
            System.out.println(Arrays.toString(dp));
        }
        return dp[amount];
    }
}

