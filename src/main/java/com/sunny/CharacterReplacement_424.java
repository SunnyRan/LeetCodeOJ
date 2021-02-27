package com.sunny;

import java.util.HashSet;
import java.util.Set;

public class CharacterReplacement_424
{
    public int characterReplacement(String s, int k) {
        if(s.length() == 0){
            return 0;
        }
        HashSet<Character> charSet = new HashSet<Character>();
        for (int i = 0; i < s.length(); i++) {
            charSet.add(s.charAt(i));
        }
        int max = k+1;
        for (Character c : charSet) {
            max = Math.max(characterReplacement(s,k,c),max);
        }
        return max;
    }


    public int characterReplacement(String s ,int k ,char c){
        int start = 0;
        int countK = k;
        int max = k;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == c){
                max = Math.max( i - start +1 ,max);
            }else{
                if(countK > 0){
                    max = Math.max( i - start +1 ,max);
                    countK--;
                }else {
                    for (int j = start; j <=i ; j++) {
                        if(s.charAt(j) != c){
                            start = j +1;
                            break;
                        }
                    }
                }
            }
        }
        return max;
    }


    public static void main(String[] args) {
        CharacterReplacement_424 demo = new CharacterReplacement_424();
        System.out.println(demo.characterReplacement("ABAB",2)); //4
        System.out.println(demo.characterReplacement("AABBBBA",1,'B')); //5
        System.out.println(demo.characterReplacement("AABABBA",1,'B')); //4
        System.out.println(demo.characterReplacement("AABABBA",1,'A')); //4
          System.out.println(demo.characterReplacement("AABA",0,'A')); //2
;    }
}
