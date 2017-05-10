package com.test;

import java.util.Scanner;

/**
 *
 * /**
 * 相同的东西放在一起。一类东西
 * 学生-->
 * 姓名、年龄、性别。<----属性
 * 吃饭、学习、王者。<----动作
 *
 *
 * Created by mac on 17/3/28.
 *
 * 对一组或者多组实物相同特性的描述  -->类
 *
 * 类有很多成员。
 * ----------------------------------------
 */
//声明了一个Studnet类

public class Student extends Person {

    //数量   类级别的属性 不是对象级别
    static int  numbers=1000;

    //声明类的属性信息


    //构造器  --->实例化的时候自己调用的
    //构造器名字必须和类名一直、并且没有返回值
    //构造器作用实例化对象时，直接初始化字段。
    public Student(){
        System.out.println("我被调用了");
    }
    public Student(String n) {
        name = n;
    }
    public Student(String name,int age,char sex){
        //this 表示当前类本身。
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        //System.out.println("age不能修改");

        this.age = age-10;
    }


    public void say(){
        System.out.println("我叫"+name+",今年"+age+"岁，"+"我是"+sex+"孩儿");
    }



    //---------------------
    //声明类的动作信息

    public void study(){
        System.out.println("study");
    }

    public void playGame(){
        System.out.println("playing");
    }


}
