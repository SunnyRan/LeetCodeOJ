/**
 * Created by sunny.su on 2017/3/1.
 **/
package com.sunny;
public class ZigZagConversion_06 {
    public static void main(String[] args) {
        ZigZagConversion_06 zc = new ZigZagConversion_06();
        System.out.println(zc.convert("ABCDEF", 4));
        System.out.println("AFBECD");
        System.out.println(zc.convert("PAYPALISHIRING", 3));
        System.out.println("PAHNAPLSIIGYIR");
        System.out.println(zc.convert("ABCD", 2));
        System.out.println("ACBD");
    }

    public String convert(String s, int numRows) {
        if (numRows == 1) return s;
        StringBuffer re[] = new StringBuffer[numRows + 1];
        for (int x = 0; x < numRows + 1; x++) re[x] = new StringBuffer();
        int i = 0, j, gap = numRows - 2;
        while (i < s.length()) {
            for (j = 0; i < s.length() && j < numRows; ) re[j++].append(s.charAt(i++));
            for (j = gap; i < s.length() && j > 0; ) re[j--].append(s.charAt(i++));
        }
        for (i = 0; i < numRows; i++) re[numRows].append(re[i].toString());
        return re[numRows].toString();
    }
}