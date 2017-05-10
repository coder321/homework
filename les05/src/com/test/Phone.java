package com.test;

/**
 * Created by mac on 2017/3/31.
 */
public class Phone {
    public Card card;

    public Phone(Card card){
        this.card = card;
    }

    public void call(){
        System.out.print("当前我的号码是"+card.number);
    }



}
