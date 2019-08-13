package com.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;


/**
 * @program: LeetCodeOJ
 * @description:
 * @author: Arnold
 * @create: 2019-07-10 20:23
 **/
public class ListTest {

    static void test(List<String> list){
        Collection<String> c = list;
        Collection<String> subList = list.subList(1,8);
        Collection<String> c2 = new ArrayList(subList);
        try{
            c.removeAll(c2);
            System.out.println(c);
        }catch (Exception e){
            System.out.println(e);
        }

    }


    public static void main(String[] args) {
        List<String> list = Arrays.asList("A B C D E F G H I G K L".split(" "));
        test(list);
        test(new ArrayList(list));
    }
}
