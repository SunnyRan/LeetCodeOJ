package com.sunny;

import java.util.Stack;

public class SimplifyPath_71 {

    public static String simplifyPath2(String path) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < path.length(); i++) {
            char c = path.charAt(i);
            if (c == '/' && !stack.isEmpty() && stack.peek() == '/') {
                continue; //处理多个//情况
            }
            if (c == '/' || i == path.length() - 1) {
                if(i == path.length() - 1){

                }
                int k = 0;
                while (!stack.isEmpty() && stack.peek() == '.') {
                    stack.pop();
                    k++;
                }
                ;
                if (k == 2) {
                    stack.pop();
                    while (!stack.isEmpty() && stack.pop() != '/') {
                    }
                    ;
                }
                if (k == 1) {
                    continue;
                }
            }
            stack.push(c);
        }
        if (stack.size() > 1 && stack.peek() == '/') {
            stack.pop();
        }
        if (stack.isEmpty()) return "/";
        StringBuilder sb = new StringBuilder();
        for (Character character : stack) {
            sb.append(character);
        }
        return sb.toString();
    }


    public static String simplifyPath(String path) {
        String[] split = path.split("/");
        Stack<String> stack = new Stack();
        for (int i = 0; i < split.length; i++) {
            if(split[i].equals("") || split[i].equals(".")){
                continue;
            }
            if(split[i].equals("..")){
                if(!stack.isEmpty()) stack.pop();
                continue;
            }
            stack.push("/" + split[i]);
        }
        if (stack.isEmpty()) return "/";
        StringBuilder sb = new StringBuilder();
        for (String str : stack) {
            sb.append(str);
        }
        return sb.toString();
    }


    public static void main(String[] args) {
        System.out.println(simplifyPath("/home/"));
        System.out.println(simplifyPath("/home//foo/"));

        System.out.println(simplifyPath("/a/./b/../../c/"));

        System.out.println(simplifyPath("/a/../../b/../c//.//"));

        System.out.println(simplifyPath("/."));

        System.out.println("/...");
    }

}
