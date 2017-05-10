package com.test;

import java.io.*;
import java.util.Scanner;

/**
 * Created by mac on 2017/4/24.
 */
public class Main2 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        File file = new File("src/com/test/Test.txt");
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        String userInput = "";
        System.out.println("请输入文件内容");
        userInput = scanner.nextLine();
        RandomAccessFile randomAccessFile = null;
        try {
            randomAccessFile = new RandomAccessFile(file,"rw");
            randomAccessFile.seek(file.length());
            randomAccessFile.write(userInput.getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if(randomAccessFile!=null){
                try {
                    randomAccessFile.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
//        FileWriter fileWriter = null;
//
//        try {
//            fileWriter = new FileWriter(file);
//            fileWriter.write(userInput);
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }finally {
//            if(fileWriter!=null){
//                try {
//                    fileWriter.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }



    }



}
