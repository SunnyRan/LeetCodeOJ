package com.sunny;

import java.util.Stack;

/**
 * @program: LeetCodeOJ
 * @description:
 * @author: Arnold
 * @create: 2019-01-25 17:31
 */
public class ValidateStackSequences_946 {

  public boolean validateStackSequences(int[] pushed, int[] popped) {
    Stack<Integer> stack = new Stack();
    int i = 0, j = 0, length = pushed.length;
    while (j < length) {
      if (i < length && popped[j] == pushed[i]) {
        System.out.println("push(" + pushed[i++] + "),pop(" + popped[j++] + "),");
        if (j == length) {
          return true;
        }
      }
      if (!stack.isEmpty() && popped[j] == stack.peek()) {
        System.out.println("pop(" + popped[j++] + "),");
        stack.pop();
        if (j == length) {
          return true;
        }
      } else {
        if (i < length) {
          stack.push(pushed[i]);
          System.out.println("push(" + pushed[i++] + "),");
        } else {
          return false;
        }
      }
    }
    return true;
  }

  //思路存在问题
//  public boolean validateStackSequences2(int[] pushed, int[] popped) {
//      if(popped.length == 0 && pushed.length ==0){return true;}
//    int x = findFirst(pushed, popped[0]);
//    if (x == -1) {
//      return false;
//    }
//    int i = x - 1, j = x + 1, length = pushed.length;
//    for (int n = 1; n < length; n++) {
//        if(i > -1 && pushed[i] == popped[n]){
//            i--;
//            continue;
//        }
//        if(j < length && pushed[j] == popped[n]){
//            j++;
//            continue;
//        }
//        return false;
//    }
//    return true;
//  }

  public int findFirst(int[] array, int find) {
    for (int i = 0; i < array.length; i++) {
      if (array[i] == find) {
        return i;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    ValidateStackSequences_946 demo = new ValidateStackSequences_946();
    int[] pushed = new int[] {1, 2, 3, 4, 5};
    //    int[] popped = new int[] {4, 3, 5, 1, 2};
    int[] popped = new int[] {4, 5, 3, 2, 1};
    //    int[] pushed = new int[] {0};
    //    int[] popped = new int[] {0};
    boolean re = demo.validateStackSequences(pushed, popped);
    System.out.println("result:" + re);
  }
}
