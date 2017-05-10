package com.test;

/**
 * Created by mac on 2017/4/18.
 */
public class TestArr {

    private String[] arr ;
    private int index = 0;

    public TestArr(String[] arr){
        this.arr = arr;
    }
    public void add(String s){
        index+=1;
        arr[index] = s;
        if(index>arr.length){
            String[] arr2 = new String[index*2];
            arr = arr2;
        }
    }
    public String get(int index){
        //if() 要判断index的范围

        return arr[index];
    }




}
