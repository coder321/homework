package com.test;

/**
 * Created by mac on 2017/4/27.
 */
public class ChuangKouRunnbale implements Runnable {

    private Chuangkou chuangKou;

    public ChuangKouRunnbale(Chuangkou chaungkou){
        this.chuangKou = chaungkou;
    }


    @Override
    public void run() {
        chuangKou.sale();

    }
}
