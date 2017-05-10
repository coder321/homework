package com.test;

import java.util.Scanner;

/**
 * 对学生信息的   学生类
 * 增、删、改、查  功能
 *
 *超市
 * 进 销 存  商品类
 *
 * 银行的
 *
 *
 *
 *
 *
 * Created by mac on 2017/3/29.
 */
public class Demo2 {
    static Scanner sc = new Scanner(System.in);
    static Student[] students = new Student[100];
    static int i=0;
    static Student student = new Student();

    public static void main(String[] args){
        //输出菜单
        printMenu();

    }
    public static void printMenu(){
        System.out.println("==================");
        System.out.println("请选择对应功能的数字");
        System.out.println("====1.增加========");
        System.out.println("====2.修改========");
        System.out.println("====3.查询========");
        System.out.println("====4.删除========");
        System.out.println("====5.退出========");
        System.out.println("==================");
        //用户选择输入菜单 ，进入对应的功能
        int flag = sc.nextInt();
        switch (flag){
            case 1:
                addStudent();
                break;
            case 2:
                updateStudent();
                break;
            case 3:
                selectStudent();
                break;
            case 4:
                deleteStudent();
                break;
            case 5:
                System.exit(0);
                break;
            default:
                System.out.print("输入有误");
                printMenu();
        }

    }


    public static void addStudent(){
//
//      boolean isComeon = true;
//      while(isComeon) {
        System.out.print("请输入学生姓名：");
        String name = sc.next();
        System.out.print("请输入年龄：");
        int age = sc.nextInt();
        System.out.print("请输入性别");
        char sex = sc.next().charAt(0);

        student = new Student(name, age, sex);
        student.name = name;
        student.setAge(age);
        student.sex = sex;
        student.say();
        students[i] = student;

        i++;
        boolean isEnd = true;
        int flag = 0;
        while (isEnd){
            System.out.print("添加成功，是否继续添加");
            System.out.print("1.继续添加");
            System.out.print("2.返回菜单");
            flag = sc.nextInt();
            if(flag == 1 || flag ==2){
                isEnd = false;
            }
        }
        for(Student s:students){
            if(s!=null){
                System.out.println(s.hashCode());
            }

        }
        if(flag == 1){
            addStudent();
        }else if(flag ==2){
            printMenu();
        }


        //}


    }
    public static void updateStudent(){




    }
    public static void selectStudent(){
        System.out.print("请输入要查询的姓名");
        String name = sc.next();
        //先将信息全部数据。
        boolean isFind = false;
        for(Student s:students){
            if(s!=null){
                if(s.name.equals(name)){
                    s.say();
                    isFind = true;
                    break;
                }
            }
        }
        if(!isFind){
            System.out.println("抱歉，没有查询到");
            System.out.println("1.重新输入");
            System.out.println("2.返回菜单");
            int flag = sc.nextInt();
            if(flag==1){
                selectStudent();
            }else{
                printMenu();
            }
        }
        printMenu();

    }
    public static void deleteStudent(){

        System.out.println(i+"");
        students[3] = null;


    }




}
