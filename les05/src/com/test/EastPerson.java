package com.test;

/**
 *
 * 方法的覆写 相当于扩展父类的成员
 *
 *
 *
 * Created by mac on 2017/3/30.
 */
public class EastPerson extends Person {


    public void eat(){
        super.eat();
        System.out.print("我用筷子");
    }
}
