package com.sunny;

public class EqualSubstring_1208 {
    public int equalSubstring2(String s, String t, int maxCost) {
        int maxCost2 = maxCost;
        int max = 0;
        int k = 0;
        int [] temp = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            temp[i] = Math.abs((s.charAt(i) - t.charAt(i)));
        }
        for (int i = 0; i < s.length(); i++) {
            if (maxCost >= temp[i]) {
                //可以扣除花费
                max = Math.max(max, i - k +1);
                maxCost -= temp[i];
            } else {
                //花费不够扣除
                boolean costed = false;
                while (i > k) {
                    //返还花费
                    maxCost = Math.min(maxCost2,maxCost +temp[k]);
                    k++;
                    //直到预算够扣除
                    if (maxCost >= temp[i]) {
                        maxCost -= temp[i];
                        costed = true;
                        break;
                    }
                }
                if(!costed){
                    k++;
                }
            }
        }
        return max;
    }

    public int equalSubstring(String s, String t, int maxCost) {
        int max = 0,start = 0, end = 0,n = s.length(),allCost = 0;
        while (end < n){
            allCost += Math.abs(s.charAt(end) - t.charAt(end));
            if(allCost > maxCost){
                allCost-=Math.abs(s.charAt(start) - t.charAt(start));
                start++;
            }
            end++;
            max = Math.max(end - start,max);
        }
        return max;
    }


    public static void main(String[] args) {
        String s = "abcd", t = "bcdf";
        String s1 = "abcd", t1 = "cdef";
        String s2 = "fkfnkrfunni", t2= "jyufzxzfbsa";
        String s3 = "krrgw", t3 = "zjxss";
        String s4= "vjlqwkzamvyv", t4 ="suusjpqkhlkz";


        EqualSubstring_1208 demo = new EqualSubstring_1208();
        System.out.println(demo.equalSubstring(s, t, 3)); //3
        System.out.println(demo.equalSubstring(s1, t1, 3));  //1
        System.out.println(demo.equalSubstring(s2, t2, 18)); // 2
        System.out.println(demo.equalSubstring(s3, t3, 19)); //2
        System.out.println(demo.equalSubstring(s4, t4, 7)); //1

    }
}
