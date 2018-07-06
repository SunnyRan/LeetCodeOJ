package com.sunny;

public class StringToInteger_08 {

  public static int myAtoi(String str) {
    str = str.trim();
    if (str.isEmpty() || str.length() <= 0) {
      return 0;
    }
    int flag = 1;
    boolean hasFlag = false;
    boolean hasNum = false;
    long re = 0;
    char c;

    for (int i = 0; i < str.length(); i++) {
      c = str.charAt(i);
      if (!isFlag(c) && !isNum(c)) {
        return (int) re * flag;
      }
      if (isFlag(c) && hasNum) {
        return (int) re * flag;
      }
      if (isNum(c)) {
        re = re * 10 + (int) c - 48;
        hasNum = true;
      }
      if (isFlag(c)) {
        if (hasFlag) {
          return (int) re * flag;
        } else {
          flag = 44 - (int) c;
        }
        hasFlag = true;
      }
      // 最大最小值判断
      if (flag == 1 && re > Integer.MAX_VALUE) {
        return Integer.MAX_VALUE;
      }
      if (flag == -1 && -re < Integer.MIN_VALUE) {
        return Integer.MIN_VALUE;
      }
    }
    return (int) re * flag;
  }

  public static boolean isFlag(char c) {
    return c == '+' || c == '-';
  }

  public static boolean isNum(char c) {
    return c >= '0' && c <= '9';
  }

  public static void main(String[] args) {
//    System.out.printf(String.valueOf(myAtoi("w-91283472332")));
//
//    System.out.printf(String.valueOf(myAtoi("24")));
//    System.out.printf(String.valueOf(myAtoi("24.3")));
//    System.out.printf(String.valueOf(myAtoi("+-24.3")));
    System.out.printf(String.valueOf(myAtoi("0-1")));
  }
}
