package com.sunny;

/**
 * Created by Sunny on 2017/3/6.
 */
public class SubmissionDetails_06 {


    public static void main(String[] args) {

    }
        public String convert(String s, int numRows) {
            if (numRows == 1) return s;
            StringBuffer re[] = new StringBuffer[numRows + 1];
            for(int x = 0; x<numRows+1;x++) re[x] = new StringBuffer();
            int i = 0, j, gap = numRows - 2;
            while (i < s.length()) {
                for (j = 0; i < s.length() && j < numRows; ) {
                    re[j++].append(s.charAt(i++));
                }
                for (j = gap; i < s.length() && j > 0;) {
                    re[j--].append(s.charAt(i++));
                }
            }
            for (i = 0; i < numRows; i++) {
                re[numRows].append(re[i].toString());
            }
            return re[numRows].toString();
    }
}
