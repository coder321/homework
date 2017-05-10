package com.test;

import java.io.Serializable;

/**
 * Created by mac on 2017/5/5.
 * wait()
 *
 */
public class Student implements Serializable {
    private String name ;
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
// "ssss"+new Studnet("111",1);
    //默认调用toString();
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
