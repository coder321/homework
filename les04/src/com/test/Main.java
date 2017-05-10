package com.test;
/**
 * 面向对象-----面向过程
 *
 * 过程强调的是功能和顺序
 * 1.画棋盘
 * 2.黑子下棋
 * 3.判断输赢
 * 4.白子下棋
 * 3.判断输赢
 * --------------------------
 * 面向对象：
 * 棋子类   颜色
 * 棋盘类   绘制
 * 规则     判断
 *
 * 创建黑子
 * 让棋盘绘制
 * 让规则判断
 * 创建白字
 * 让棋盘绘制
 * 让规则判断
 *
 * static  静态的。
 *
 *
 *
 *
 * 学生类
 *
 * 火车类
 *
 * 教师类
 *
 * 电脑类
 *
 * 手机类
 *
 * 学校类
 *
 * 荣耀类
 *
 *
 * 并录入保存信息
 *
 *
 *
 *
 *
 *
 * ***/




public class Main {

    public static void main(String[] args) {
	    // write your code here
        //产生对象 Student类的对象
        //具象化过程  实例化的过程

        Student[] students = new Student[2];

        Student student1 = new Student("susongjun",19,'中');
        students[0] = student1;
        Student student2 = new Student("susongjun2",10,'女');
        students[1] = student2;

        for(int i = 0;i<students.length;i++){
            students[i].say();
        }






        //System.out.println("学生有"+Student.numbers);

        //Student student1 = new Student();
        //student1.name="xusongjun";
        //Student student2 = new Student() ;
        //student2.say();
        //匿名对象
        //new Student().name = "sss";


        /*student1.name = "xusongjun";
        student1.age = 19;
        student1.sex = '中';
        student1.eat();
        //想两个或多个，只能通过new创建
        Student student2 = new Student();
        student2.name = "dingyi";
        */




    }
}




