package com.sunny;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FindLongestWord_524 {

    public String findLongestWord(String s, List<String> dictionary) {
        List<String> collect = dictionary.stream().sorted(Comparator.comparing(String::length)).collect(Collectors.toList());
        for (int i = collect.size()-1; i >=0 ; i--) {
            String str = collect.get(i);
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                while (count < s.length()){
                    if(s.charAt(count++) == str.charAt(j)){
                        if(j == str.length() -1){
                            return str;
                        }
                        break;
                    }
                }
            }
        }
        return "";
    }


    public String findLongestWord2(String s, List<String> dictionary) {
        String re = "";
        for (int i = 0; i <dictionary.size() ; i++) {
            String str = dictionary.get(i);
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                while (count < s.length()){
                    if(s.charAt(count++) == str.charAt(j)){
                        if(j == str.length() -1){
                            re = str.length() > re.length() ? str:re;
                        }
                        break;
                    }
                }
            }
        }
        return re;
    }


    public static void main(String[] args) {
        FindLongestWord_524 demo = new FindLongestWord_524();
        List<String> list =new ArrayList();
        list.add("abe");
        list.add("abc");
        System.out.println(demo.findLongestWord2("abce",list));
    }
}
