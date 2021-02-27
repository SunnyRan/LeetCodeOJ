package com.sunny;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RestoreIPAddresses_93 {
    public List<String> restoreIpAddresses(String s) {

        List<String> temp = new ArrayList<>();
        List<String> result = new ArrayList<>();
        if(s.length() > 12){
            return result;
        }
        getNextIp(s,temp,result);
        return  result;
    }


    public void getNextIp(String s ,List<String> temp,List<String> result){
        //最后一位数据处理
        if(temp.size() == 4 && s.length() == 0){
            result.add(String.join(".", temp));
        }
        //空字符串处理
        if(s.length() == 0){
            return;
        }
        //如果首位为0
        if(s.charAt(0) == '0'){
            List<String> newTemp = new ArrayList<>(temp);
            newTemp.add("0");
            getNextIp(s.substring(1),newTemp,result);
            return;
        }

        //前缀匹配
        for (int i = 1; i <= s.length(); i++) {
            Integer integer = Integer.valueOf(s.substring(0,i));
            if(integer < 256){
                List<String> newTemp = new ArrayList<>(temp);
                newTemp.add(s.substring(0,i));
                getNextIp(s.substring(i),newTemp,result);
            }else {
                return;
            }
        }

    }


    public static void main(String[] args) {
        RestoreIPAddresses_93 demo = new RestoreIPAddresses_93();
        System.out.println(demo.restoreIpAddresses("25525511135"));
        System.out.println(demo.restoreIpAddresses("0000"));
        System.out.println(demo.restoreIpAddresses("010010"));
    }
}
