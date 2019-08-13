package com.sunny;

/**
 * Created by sunny.su on 2017/3/10.
 */
public class LicenseKeyFormatting_482 {
    public static void main(String[] args) {
        LicenseKeyFormatting_482 lkf = new LicenseKeyFormatting_482();
        String str = lkf.licenseKeyFormatting("2-4A0r7-4k-32", 4);
        System.out.println(str);
    }

    public String licenseKeyFormatting(String S, int K) {
        StringBuffer sb = new StringBuffer();
        int lenght = 0, first = 0;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) != '-') lenght++;
        }
        first = lenght % K == 0 ? 0 : K - lenght % K;
        for (int i = -1; i < S.length()-1; ) {
            first %= K;
            if (S.charAt(++i) != '-') {
                if (first == 0 &&sb.length() !=0 ) sb.append('-');
                sb.append(S.charAt(i));
                first++;
            }
        }
        return sb.toString().toUpperCase();
    }
}
