package com.test;

import java.util.Comparator;

/**
 * Created by mac on 2017/4/18.
 * 比较器
 * 定制排序
 *
 * 1.hashCode  。。。
 * 2.成绩相等  比年龄
 * 3.倒叙输出
 * 4.Map 添加  删除  查找  遍历
 * 5.JAVA  IO 输入输出（）
 *
 *
 *
 */
public class MyComparator implements Comparator {


    @Override
    public int compare(Object o1, Object o2) {




        Student s1 = (Student)o1;
        Student s2 = (Student)o2;
        if(s1.getAge()>s2.getAge()){
            return 1;
        }
        if(s1.getAge()<s2.getAge()){
            return -1;
        }

        return 0;
    }
}
