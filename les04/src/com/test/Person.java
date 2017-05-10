package com.test;

/**
 * 泛化
 * 将Student类和Teacher 共同的部分抽离出来Person，-->泛化
 *
 * 特化
 * 从父类当中，有自己特殊的部分，-->特化
 *
 *
 * Person 父类
 *
 * extends-->继承
 *
 * Student和Teacher 子类
 *
 *
 * 三个修饰符
 * public   功能  任何地方
 * private  类的内内部
 * protected  子类当中，不能再类的外部
 *
 *
 *
 *
 * Created by mac on 2017/3/30.
 */
public class Person {

    public String name;
    public char sex;
    protected int age;
    public int hight;

    public void eat(){
        System.out.print("吃饭");
    }
    public void sleep(){
        System.out.print("睡觉");
    }

}
