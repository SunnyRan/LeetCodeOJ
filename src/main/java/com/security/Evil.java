package com.security;

import java.io.IOException;

/**
 * @program: LeetCodeOJ
 * @description:
 * @author: Arnold
 * @create: 2019-07-15 19:35
 **/
public class Evil {

    public String getName() {
        System.out.println("i am getterName!");
        return name;
    }

    public void setName(String name) {
        System.out.println("i am setterName!");
        this.name = name;
    }

    public String name;

    public int getAge() {
        System.out.println("i am getterAge!");
        return age;
    }

    public void setAge(int age) {
        System.out.println("i am setterAge!");
        this.age = age;
    }

    private int age;

    public Evil() throws IOException {
        System.out.println("i am constructor!");
        Runtime.getRuntime().exec("open /Applications/Calculator.app");
    }


}
