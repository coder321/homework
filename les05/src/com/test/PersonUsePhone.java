package com.test;

/**
 * Created by mac on 2017/3/31.
 */
public class PersonUsePhone {

    public Phone phone;

    public PersonUsePhone(Phone phone){
        this.phone = phone;
    }

    public void callPhone(){
        this.phone.call();
    }

}
