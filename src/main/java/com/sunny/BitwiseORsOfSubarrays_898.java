package com.sunny;

import java.util.HashSet;
import java.util.Set;

/**
 * @program: LeetCodeOJ
 * @description:
 * @author: Arnold
 * @create: 2019-01-29 18:43
 */
public class BitwiseORsOfSubarrays_898 {

  // 80 / 83 test cases passed.  Status: Time Limit Exceeded
  public int subarrayBitwiseORs(int[] A) {
    int size = A.length;
    HashSet reSet = new HashSet();
    int[] ends = new int[size + 1];
    for (int i = 0; i < size; i++) {
      ends[i] = 0;
      for (int j = i; j < size; j++) {
        ends[j + 1] = ends[j] | A[j];
        reSet.add(ends[j + 1]);
      }
    }
    return reSet.size();
  }

  // 83 / 83 test cases passed.
  // Status: Accepted
  // Runtime: 357 ms
  public int subarrayBitwiseORs2(int[] A) {
    HashSet<Integer> cur = new HashSet();
    HashSet<Integer> ans = new HashSet();
    for (int a : A) {
      HashSet nxt = new HashSet<Integer>();
      nxt.add(a);
      for (int b : cur) {
        nxt.add(a | b);
      }
      ans.addAll(nxt);
      cur = nxt;
    }
    return ans.size();
  }

  public static void main(String[] args) {
    BitwiseORsOfSubarrays_898 obj = new BitwiseORsOfSubarrays_898();
    int[] ends = new int[] {1, 2, 4};
    int re = obj.subarrayBitwiseORs2(ends);
    System.out.println(re);
  }
}
