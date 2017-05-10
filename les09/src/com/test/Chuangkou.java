package com.test;

/**
 * Created by mac on 2017/4/26.
 */
public class Chuangkou {

    private static  Piao piao = new Piao("临沂到北京",50);
    private String name;
    public Chuangkou(int number,String name){
        //this.number = number;
        this.name = name;
    }

    public  void sale(){
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            int number = piao.getNumber();
            number--;
            piao.setNumber(number);
            if(number<1){
                System.out.println(name+"票售罄");
                break;
            }

            System.out.println(name + "卖出了第" + number + "张票");

        }
    }

}
