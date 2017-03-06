package com.sunny;

/**
 * Created by Sunny on 2017/3/6.
 */
public class PalindromeNumber_09 {
    public static void main(String[] args) {
        boolean flag = isPalindrome(-22);
        String s = flag?"0":"1";
        System.out.println(s);
    }

    public static boolean isPalindrome(int x) {
        int k = 0,j=x;
        while(x >0) {
            k=k*10+(x%10);
            x=x/10;
        }
        return k == j ;
    }
}
