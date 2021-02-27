package com.sunny;

import java.util.Stack;

public class ReverseWordsString_151 {
    public static String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        int i = s.length() -1;
        while (i>=0) {
            int len = 0;
            while (i >=0 && s.charAt(i) != ' '){
                i--;
                len++;
            }
            if(len>0){
                sb.append(s.substring(i+1,i+len+1) + " ");
            }
            i--;
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("a g"));
    }

}
