package com.sunny;

import javax.print.DocFlavor;
import java.util.*;

/**
 * @program: LeetCodeOJ
 * @description:
 * @author: Arnold
 * @create: 2019-01-31 15:17
 */
public class WordBreak2_140 {

//  public List<String> re = new ArrayList<>();
//  public HashMap<Character, List<String>> pre = new HashMap<>();
//
//  public List<String> wordBreak(String s, List<String> wordDict) {
//    // 预处理数据
//    for (String word : wordDict) {
//      char first = word.charAt(0);
//      if (pre.containsKey(first)) {
//        pre.get(first).add(word);
//      } else {
//        LinkedList<String> list = new LinkedList<>();
//        list.add(word);
//        pre.put(first, list);
//      }
//    }
//    wordBreakPro(s, "");
//    return re;
//  }
//
//  public void wordBreakPro(String s, String cur) {
//    char first = s.charAt(0);
//    if (pre.containsKey(first)) {
//      List<String> firstList = pre.get(first);
//      for (int k = 0; k < firstList.size(); k++) {
//        String word = firstList.get(k);
//        int length = word.length();
//        if (s.length() >= length && word.equals(s.substring(0, length))) {
//          if (s.length() == word.length()) {
//            re.add( cur + " " + word.substring(1));
//          } else {
//            wordBreakPro(s.substring(length), cur + " " + word);
//          }
//        }
//      }
//    }
//  }


    public ArrayList<String> wordBreak(String s, List<String> wordDict) {
        Map<String, ArrayList<String>> map = new HashMap();
        Set<String> dict = new HashSet(wordDict);

        return wordBreakHelper(s, dict, map);
    }

    private ArrayList<String> wordBreakHelper(String s, Set<String> dict, Map<String, ArrayList<String>> map) {
        if (map.containsKey(s)) {
            return map.get(s);
        }

        ArrayList<String> newList = new ArrayList();
        if (dict.contains(s)) {
            newList.add(s);
        }

        for (int i = 1; i < s.length(); i++) {
            String possibleWord = s.substring(0, i);
            if (dict.contains(possibleWord)) {
                ArrayList<String> wordsList = wordBreakHelper(s.substring(i), dict, map);
                for (String words: wordsList) {
                    newList.add(possibleWord + " " + words);
                }
            }
        }

        map.put(s, newList);
        return newList;
    }

  public static void main(String[] args) {
    WordBreak2_140 obj = new WordBreak2_140();
    String str = "catsanddog";
    List<String> words = Arrays.asList("cat", "cats", "and", "sand", "dog");
    System.out.println(obj.wordBreak(str, words));
  }
}
