package com.sunny;

public class LongestCommonPrefix_14 {

    public String longestCommonPrefix(String[] strs) {
        int index = 0;
        String a = "";
        int min = strs.length > 0 ? strs[0].length() : 0;
        for (String str : strs) {
            min = str.length() < min ? str.length() : min;
        }
        while (index < min) {
            char key = strs[0].charAt(index);
            for (int i = 1; i < strs.length; i++) {
                if (key != strs[i].charAt(index))
                    return a;
            }
            index++;
            a += key;
        }
        return a;
    }


    public static String longestCommonPrefix2(String[] strs) {
        if (strs.length <= 0) {
            return "";
        }
        String ans =  strs[0];
        for (int i = 1; i < strs.length; i++) {
            int min = ans.length() > strs[i].length() ? strs[i].length() : ans.length();
            int k = 0;
            for( ;k< min ; k ++){
                if(ans.charAt(k) != strs[i].charAt(k)){
                    break;
                }
            }
            ans = ans.substring(0,k);
        }
        return ans;
    }

    public static void main(String[] args) {
        String[] strs = new String[]{"dog","dog","dog"};
        System.out.println(longestCommonPrefix2(strs));
    }
}
