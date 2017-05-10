package com.cp;

/**
 * Created by mac on 2017/4/27.
 */
public class Producter implements Runnable {

    private Storage storage;
    private int number;
    public Producter(Storage storage,int number){
        this.storage = storage;
        this.number = number;
    }


    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            storage.push(number);
        }


    }
}
