package com.lcm.person;

/**
 * ****************************************************************
 * Author:LCM
 * Date: 2017/8/31 下午2:59
 * Desc:
 * *****************************************************************
 */
public class Person {

    private String name;
    private int age;
    private String sex;
    private String country;

    private Person() {
    }

    private Person(String name, int age, String sex, String country) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

    public static class Builder {
        private String name;
        private int age;
        private String sex;
        private String country;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setSex(String sex) {
            this.sex = sex;
            return this;
        }

        public Builder setCountry(String country) {
            this.country = country;
            return this;
        }

        public Person create() {
            return new Person(name, age, sex, country);
        }
    }
}
