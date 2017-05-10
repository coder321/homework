package com.test;

/**
 * Created by mac on 2017/4/26.
 */
public class ChuangKouThread extends Thread {
    Chuangkou chuangkou ;
    public ChuangKouThread(Chuangkou chuangkou){
        this.chuangkou = chuangkou;
    }

    @Override
    public void run() {
        chuangkou.sale();

    }
}
