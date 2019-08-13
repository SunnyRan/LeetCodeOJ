package com.sunny;

/**
 * Created by Sunny on 2017/3/6.
 */
public class ReverseInteger_07 {
    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
        System.out.println(reverse(123124));
        System.out.println(reverse(-123));
    }

    public static int reverse(int x) {
        int k = 0,j=x>0?1:-1;
        x = x*j;
        while(x >0 ) {
            if(k>Integer.MAX_VALUE/10 || k*10>Integer.MAX_VALUE-(x%10)) return 0;
            k=k*10+(x%10);
            x=x/10;
        }
        return k * j ;
    }

}
