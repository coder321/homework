package com.test;

public class Main {


    public static void main(String[] args) {
	// write your code here
        //创建线程
//        MyThread myThread = new MyThread();
//        //启动线程
//        myThread.start();
//
////        try {
////            Thread.sleep(10000);
////        } catch (InterruptedException e) {
////            e.printStackTrace();
////        }
//        //创建线程
//        MyRunnable myRunnable = new MyRunnable();
//        //启动线程
//        new Thread(myRunnable).start();
//
//
//
//
//        for(int i = 0;i<10000;i++){
//            System.out.println("我是主线程"+i);
//
//        }

        //统计各窗口各卖出了多少张票。
        int piao = 50;
        Chuangkou chuangkou1 = new Chuangkou(piao,"窗口一");
        Chuangkou chuangkou2 = new Chuangkou(piao,"窗口二");
        Chuangkou chuangkou3 = new Chuangkou(piao,"窗口三");

        ChuangKouRunnbale chuangKouRunnbale1 = new ChuangKouRunnbale(chuangkou1);
        ChuangKouRunnbale chuangKouRunnbale2 = new ChuangKouRunnbale(chuangkou2);
        ChuangKouRunnbale chuangKouRunnbale3 = new ChuangKouRunnbale(chuangkou3);

        new Thread(chuangKouRunnbale1).start();
        new Thread(chuangKouRunnbale2).start();
        new Thread(chuangKouRunnbale3).start();



//        ChuangKouThread chuangKouThread1 = new ChuangKouThread(chuangkou1);
//        ChuangKouThread chuangKouThread2 = new ChuangKouThread(chuangkou2);
//        ChuangKouThread chuangKouThread3 = new ChuangKouThread(chuangkou3);
//        chuangKouThread1.start();
//        chuangKouThread2.start();
//        chuangKouThread3.start();


    }
}
