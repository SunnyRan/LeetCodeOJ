package com.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * @program: LeetCodeOJ
 * @description:
 * @author: Arnold
 * @create: 2019-07-04 11:45
 **/
public class TestList {

    public static int max = 500000;
    public void addArrayList(){
        ArrayList list = new ArrayList<Integer>();
        for(int i =0;i<max;i++){
            list.add(i);
        }
    }


    public void addLinkList(){
        LinkedList list = new LinkedList<Integer>();
        for(int i =0;i<max;i++){
            list.add(i);
        }
    }

    public void addArrayList2(){
        ArrayList list = new ArrayList<Integer>(max);
        for(int i =0;i<max;i++){
            list.add(i);
        }
    }

    public void addArrayList3(){
        ArrayList list = new ArrayList<Integer>(max);
        for(int i =0;i<max;i++){
            list.add(0,i);
        }
    }

    static ArrayList getArraysList(){
        ArrayList list = new ArrayList<Integer>(max);
        for(int i =0;i<max;i++){
            list.add(0,i);
        }
        return list;
    }

    static LinkedList getLinkedList(){
        LinkedList list = new LinkedList<Integer>();
        for(int i =0;i<max;i++){
            list.add(0,i);
        }
        return list;
    }

    public static void main(String[] args) {
        TestList test = new TestList();

        Long startTime=System.currentTimeMillis();   //获取开始时间
        test.addArrayList();  //测试的代码段
        long endTime=System.currentTimeMillis(); //获取结束时间
        System.out.println("ArrayList程序add(obj)运行时间（不初始化数组大小）： "+(endTime-startTime)+"ms");


        Long startTime2=System.currentTimeMillis();   //获取开始时间
        test.addLinkList();  //测试的代码段
        long endTime2=System.currentTimeMillis(); //获取结束时间
        System.out.println("LinkList程序add(obj)运行时间(不初始化数组大小)： "+(endTime2-startTime2)+"ms");


        Long startTime3=System.currentTimeMillis();   //获取开始时间
        test.addArrayList2();  //测试的代码段
        long endTime3=System.currentTimeMillis(); //获取结束时间
        System.out.println("ArrayList程序add(obj)运行时间(初始化数组大小)： "+(endTime3-startTime3)+"ms");

        startTime3=System.currentTimeMillis();   //获取开始时间
        test.addArrayList3();  //测试的代码段
        endTime3=System.currentTimeMillis(); //获取结束时间
        System.out.println("ArrayList程序add(index,obj)运行时间(初始化数组大小)： "+(endTime3-startTime3)+"ms");


//        List list;
//        Long startTime3,endTime3;
//        Iterator it;
//
//
//        list = getArraysList();
//        startTime3=System.currentTimeMillis();   //获取开始时间
//        it = list.iterator();
//        while (it.hasNext()){
//            Object i =  it.next();
//        }
//        endTime3=System.currentTimeMillis(); //获取结束时间
//        System.out.println("ArrayList程序运行时间Iterator： "+(endTime3-startTime3)+"ms");
//
//
//        startTime3=System.currentTimeMillis();   //获取开始时间
//        for (int i = 0;i<list.size();i++ ) {
//            list.get(i);
//        }
//        endTime3=System.currentTimeMillis(); //获取结束时间
//        System.out.println("ArrayList程序运行时间for： "+(endTime3-startTime3)+"ms");
//
//
//
//
//
//
//        startTime3=System.currentTimeMillis();   //获取开始时间
//        it = list.iterator();
//        while (it.hasNext()){
//            Object i =  it.next();
//        }
//        endTime3=System.currentTimeMillis(); //获取结束时间
//        System.out.println("LinkList程序运行时间Iterator： "+(endTime3-startTime3)+"ms");
//
//
//        list = getLinkedList();
//        startTime3=System.currentTimeMillis();   //获取开始时间
//        for (int i = 0;i<list.size();i++ ) {
//            list.get(i);
//        }
//        endTime3=System.currentTimeMillis(); //获取结束时间
//        System.out.println("LinkList程序运行时间for： "+(endTime3-startTime3)+"ms");



    }
}
