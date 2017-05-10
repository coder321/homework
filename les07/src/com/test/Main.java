package com.test;

import java.io.*;

public class Main {

    public static void main(String[] args)  {
	// write your code here

        //创建File实例
//        File file = new File("src/com/test/Test.txt");
//        //创建文件
//        try {
//
//            file.createNewFile();
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println("name="+file.getName());
//        System.out.println("path="+file.getAbsolutePath());
//        System.out.println("name="+file.getPath());
//        System.out.println("parent="+file.getParent());
//        System.out.println("length="+file.length());
//

//        if(file.exists()){
//            file.delete();
//        }

        //File file = new File("src/com/test/Test.txt");
        /*try {
            FileReader fileReader = new FileReader(file);
            //int a = fileReader.read();
            char[] chars = new char[10];//缓冲区
            //fileReader.read(chars);
//            for(char c:chars){
//                System.out.println("第一次"+c);
//            }
            String s = "";
            int len = 0;//知道到底读了多少个。
            while((len = fileReader.read(chars)) != -1){
                //System.out.println("读取个数"+len);
                String ss = new String(chars,0,len);
                s+=ss;
            }
            System.out.print(s);


//            char[] chars2 = new char[10];//缓冲区
//            fileReader.read(chars2);
//            for(char c:chars2){
//                System.out.println("第二次"+c);
//            }


            FileWriter fileWriter = new FileWriter(file);

            //String s = "songjun真水";
            fileWriter.write(s.toCharArray())
            //fileWriter.write(s,0,s.length());
            //fileWriter.close();
            //用户输入的内容保存到文件中，不能覆盖。


        } catch (Exception e) {
            e.printStackTrace();
        }
*/

        //String[] strings = file.list();
        //File[] strings = file.listFiles();

        //findFile(file);
        //查询出src目录底下所有的.java文件


        //-----以上是字符流----------------
        //--------字节流------------------
        File file = new File("src/com/test/Test.txt");

        try {
//            FileInputStream fileInputStream = new FileInputStream(file);
//            byte[] bytes = new byte[10];
//            int len = 0;
//            StringBuffer snb = new StringBuffer();
//
//            while((len = fileInputStream.read(bytes))!=-1){
//                snb.append(new String(bytes,0,len));
//            }

//            FileOutputStream fileOutputStream = new FileOutputStream(file);
//            String s = "songmunawefaefaergersgetgsergsergwergergergergergergergergergeraefeawfaewfaefewa";
//            byte[] bytes = s.getBytes();
//            fileOutputStream.write(bytes);




//            fileInputStream.read(bytes);
//            String ss = new String(bytes);
            //System.out.println(snb.toString());


        } catch (Exception e) {
            e.printStackTrace();
        }


    }


    public static void findFile(File f){
        if(f.isDirectory()){
            File[] files = f.listFiles();
            for(File f1:files){
                findFile(f1);
            }
        }else{
            System.out.println("path="+f.getAbsolutePath());
        }
    }

}
