package com.test;

/**
 * Created by mac on 2017/3/31.
 */
public class Demo {

    public static void main(String[] at){

        //int  i = 0;
        //-128  --- 127

        //设计模式  23
        //1.享元模式
        //

//        Integer integer = new Integer(100);//自动装箱
//        Integer integer1 = new Integer(100);
//
//        System.out.println(integer.equals( integer1));
//        //---   包装类和基本数据类型的转换    ----
//        Integer i = new Integer(1);//创建包装类对象
//        i = 10;//自动装箱
//        int i1 = i.intValue();//从包装类转换成基本数据类型
//        float i2= i.floatValue();
//        System.out.print(i2);

        //---------   和String 转换----------

        //ArrayIndexOutofBrondsException  越界
        //nullpointerException  空指针
        //ClassCastException   类型转换
        //NumberFarmatException  格式化异常


        //字符串行转换成基本数据类型
        String num = "3333";
        //int i4 = Integer.parseInt(num);
        float f =  Float.parseFloat(num);
        System.out.print(f);
        //基本数据类型，转换成String类型
        int i= 10;
        String  s = i+""+i;// 1010i
        String  ss = String.valueOf(f);
        String sss = new String(f+"");




    }

}
