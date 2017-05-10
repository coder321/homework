package com.bank;

/**
 * Created by mac on 2017/4/27.
 */

public class Main2 {
    public static void main(String[] agrs){
        ZhangHU zhangHU = new ZhangHU("宋军",4000);
        QuQianThread ka = new QuQianThread(zhangHU,2000);
        QuQianThread zhe = new QuQianThread(zhangHU,3000);
        new Thread(ka).start();
        new Thread(zhe).start();




    }
}
