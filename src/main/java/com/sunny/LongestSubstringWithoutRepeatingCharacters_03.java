package com.sunny;

import java.util.Hashtable;

public class LongestSubstringWithoutRepeatingCharacters_03 {

	public static void main(String[] args) {
		String s = "jxdlnaaij";
		String s1 = "au";
		String s2 ="abcabcbb";
		String s3 = "";
		System.out.println(lengthOfLongestSubstring(s)); //6
		System.out.println(lengthOfLongestSubstring(s1)); //2
		System.out.println(lengthOfLongestSubstring(s2)); //3
		System.out.println(lengthOfLongestSubstring(s3)); //0
	}
	
	static  public int lengthOfLongestSubstring(String s) {
    	Hashtable<Character,Integer> hs = new Hashtable<Character,Integer>();
    	int star = 0,end = 0;
    	int maxLength = 0;
    	if(s.length() == 0) return 0;
            for(int i = star ;i < s.length();i++){          	
            	Integer n = hs.get(s.charAt(i));
            	if(n != null && star<=n){
            		maxLength = end-star+1>maxLength?end-star+1:maxLength;
            		star = n+1;
            	}else{
            		end = i;
            	}
        		hs.put(s.charAt(i), i);	
            }
            maxLength = end-star+1>maxLength?end-star+1:maxLength;
            return maxLength;
    }
}
