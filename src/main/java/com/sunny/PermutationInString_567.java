package com.sunny;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class PermutationInString_567 {

    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }
        //初始化数据
        HashMap<Character, Integer> s1Map = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            if (s1Map.containsKey(s1.charAt(i))) {
                s1Map.put(s1.charAt(i), s1Map.get(s1.charAt(i)) + 1);
            } else {
                s1Map.put(s1.charAt(i), 1);
            }
        }
        int stepLength = s1.length();
        int finish = 0;
        for (int i = 0; i < s2.length(); i++) {
            if (i - stepLength > -1 && MapAddOne(s1Map, s2.charAt(i - stepLength))) {
            }
            if (s1Map.containsKey(s2.charAt(i)) && MapMinusOne(s1Map, s2.charAt(i))) {
            }
            if (s1Map.values().stream().allMatch(v->v == 0))
                return true;
        }
        return false;
    }


    public boolean MapAddOne(HashMap<Character, Integer> s1Map, Character c) {
        if (s1Map.containsKey(c)) {
            Integer count = s1Map.get(c);
            s1Map.put(c, count + 1);
            return count > 0;
        }
        return false;
    }

    public boolean MapMinusOne(HashMap<Character, Integer> s1Map, Character c) {
        Integer count = s1Map.get(c);
        s1Map.put(c, count - 1);
        return count > 0;
    }


    public static void main(String[] args) {
        PermutationInString_567 demo = new PermutationInString_567();
        System.out.println(demo.checkInclusion("ab", "eidboaoo")); //f
        System.out.println(demo.checkInclusion("ab", "eidbaooo")); //t
        System.out.println(demo.checkInclusion("adc", "dcda")); //t
        System.out.println(demo.checkInclusion("hello", "ooolleoooleh")); //f
        System.out.println(demo.checkInclusion("abc", "bbbca")); //t
    }
}
