package com.test;

/**
 * Created by mac on 2017/3/30.
 */
public class WestPerson extends Person {



    public WestPerson(String name,char sex,int age){
        super(name,sex,age);//相当于调用了父类的构造器，必须写在第一行
        System.out.println(this.name+",有参数构造器"+this.age+","+this.sex);
    }


    public WestPerson(){
        System.out.println("我是WestPerson的构造器");
    }
    public void eat(){
        System.out.print("我用刀子");
    }

}
