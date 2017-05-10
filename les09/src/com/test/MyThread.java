package com.test;

/**
 * Created by mac on 2017/4/26.
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        while (true){
            try{
                Thread.sleep(1000);
                System.out.println("我是子线程1"+System.currentTimeMillis());

            }catch (Exception e){}
        }

    }
}
