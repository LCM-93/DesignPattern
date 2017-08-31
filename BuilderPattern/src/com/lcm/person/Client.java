package com.lcm.person;

/**
 * ****************************************************************
 * Author:LCM
 * Date: 2017/8/31 下午3:07
 * Desc:
 * *****************************************************************
 */
public class Client {

    public static void main(String[] args) {
        Person.Builder builder = new Person.Builder();

        Person person = builder.setAge(14)
                                .setCountry("中国")
                                .setName("张三")
                                .setSex("男")
                                .create();

        System.out.println(person.toString());
    }
}
