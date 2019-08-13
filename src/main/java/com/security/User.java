package com.security;

/**
 * @program: LeetCodeOJ
 * @description:
 * @author: Arnold
 * @create: 2019-07-15 17:31
 **/

 public class User {
        public String Username;
        public String Sex;
        public String getUsername() {
            return Username;
        }
        public void setUsername(String username) {
            Username = username;
        }
        public String getSex() {
            return Sex;
        }
        public void setSex(String sex) {
            Sex = sex;
        }


    public User() {
    }

    public User(String username, String sex) {
        Username = username;
        Sex = sex;
    }
}
