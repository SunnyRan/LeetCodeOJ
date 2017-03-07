package com.sunny;

/**
 * Created by sunny.su on 2017/3/7.
 */
public class CoinChange2_518 {

    public static void main(String[] args) {
        CoinChange2_518 cc = new CoinChange2_518();
        int[] ar1 = {3,5,7,8,9,10,11};
        int re = cc.change(  500, ar1);
        System.out.printf(String.valueOf(re));

    }



    public int total = 0;
    public int change(int amount, int[] coins) {
        if(amount == 0 )return 1;
        int star = coins.length - 1;
      //  while (star > -1) {
            getChange(amount, coins, star--);
      //  }
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
}

