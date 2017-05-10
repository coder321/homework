package com.test;

/**
 *
 * 继承
 *
 * Created by mac on 2017/3/30.
 */
public class Person{

    public String name;
    public char sex;
    public int age;
    public  Person(){
        System.out.println("我是Person构造器");
    }


    public  Person(String name,char sex,int age){
        this.name = name;
        this.age = age;
        this.sex = sex;
        System.out.println("Person类有参构造器");
    }

    public void eat(){
        System.out.print("eat");
    }

    public void sleep(){
        System.out.print("sleep");
    }


}
