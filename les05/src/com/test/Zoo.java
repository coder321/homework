package com.test;

/**
 * Created by mac on 2017/3/30.
 */
public class Zoo {

    //public void giveFoodForDog(ErHa erHa){
      //  System.out.println("玩一会");
       // erHa.eat();
    //}
    //public void giveFoodForDog(TaiDi taiDi){

      //  taiDi.eat();
    //}
    public void giveFoodForDog(Dog dog){
        System.out.println("玩一会");
        //类型转换 instanceof 判断是不是这个类型
        if(dog instanceof ErHa){
            ((ErHa)dog).biaoqing();
        }
        dog.eat();// 多态。  产生继承关系
    }
    //....




}
