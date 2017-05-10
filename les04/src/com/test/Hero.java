package com.test;

/**
 * 英雄
 * 名字  装备 类型 皮肤 伤害值  属性
 * 技能 移动 普攻
 *
 * 对一组或者多组实物相同特性的描述  -->类
 *
 * 类   --> 抽象化；
 *
 * 类当中的个体才能进行实际的操作。
 *
 * 花木兰   大桥    亚瑟  -->英雄类当中的单独存在的个体。
 *
 * 个体称之为  <---> 对象 (类当中的一个个体)
 *
 *    抽象化过程
 * 类 <=======>对象
 *    具象化过程
 *
 * 面向对象
 *
 *
 *
 *
 * Created by mac on 17/3/28.
 */
public class Hero {
    //属性
    String name;//英雄的名字
    String[] zhuangbei;
    int type;//1-->射手，2-->法师。。。
    String pfname; //皮肤
    int  heat; //伤害值

    //方法
    //技能
    public boolean jiNeng(){
        System.out.println("闪现");
        return true;
    }
    //移动
    public int  move(){
        System.out.println("MOVE");
        return 0;
    }
    //平A
    public int puGong(){
        System.out.println("攻击");
        return 0;
    }

}











