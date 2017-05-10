package com.test;

/**
 * Created by mac on 2017/4/18.\
 *
 * 让自定义类实现自己的比较规则（比较器）
 *
 */
//public class Student implements Comparable {
public class Student  {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

//    public int compareTo(Object o){
//        Student student = (Student)o;
//        if(this.age > student.getAge()){
//            return 1;//正整数。
//        }
//        if(this.age == student.getAge()){
//            return 0; //相等返回0。
//        }
//        return -1;//  小于 返回负整数。
//
//    }
}
