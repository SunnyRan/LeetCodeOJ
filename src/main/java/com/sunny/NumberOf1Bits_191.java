package com.sunny;

/**
 * @program: LeetCodeOJ
 * @description:
 *     <p>Write a function that takes an unsigned integer and return the number of '1' bits it has
 *     (also known as the Hamming weight).
 *     <p>Example 1:
 *     <p>Input: 00000000000000000000000000001011 Output: 3 Explanation: The input binary string
 *     00000000000000000000000000001011 has a total of three '1' bits.
 * @author: Arnold
 * @create: 2019-01-29 17:53
 */
public class NumberOf1Bits_191 {

  public int hammingWeight(int n) {
    int re = 0;
    // 1、当移位的数是正数的时候，>> 和>>>效果都是一样的；
    // 2、当移位的数是负数的时候，>>将二进制高位用1补上，而>>>将二进制高位用0补上，这就导致了>>>将负数的移位操作结果变成了正数（因为高位用0补上了）
    for (; n != 0; n >>>= 1) {
      re += (n & 1);
    }
    return re;
  }

  public static void main(String[] args) {
    NumberOf1Bits_191 obj = new NumberOf1Bits_191();
   // System.out.println(obj.hammingWeight(0b1011));
  }
}
