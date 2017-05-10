package com.test;

/*
*
*回顾：
* java 的常用类（API)
* StringBuffer();
* String final 修饰的   value属性  也是final;
* gc不可控制
* StringBuffer()   StringBuilder()
* 面试题   区别；
* while(){
*   stringBuffer.append("ss");
*
* }
*
* Math.random();返回0.0----1.0之间的数字(不能包括1.0);
* *（最大值-最小值）+最小值
*
* SimpleDateFormat
*
* Date()
*
*
* java的集合
*
* 相当于容器
* 数组   对象数组
*
* 创建完对象之后，下一次想用的，  必须知道内存地址
* gc  内存  计数器
*
* Collection
* List
* AarrayList
* LinkedList
*
*
* Set
* HashSet
* TreeSet
*
* Map
* HashMap
* HashTable
* TreeMap
*
* 添加  删除  替换  查找  清空  遍历
*
*
*
*
*
*
*
* java IO流
*
*         输出流        输入流
* 字节流  OutputStream  InputStream
* 字符流  Writer         Reader
*
* File   操作文件的  创建  删除  遍历
* FileReader
* FileWriter
* FileOuputStream
* FileInputStream
*
*
*作业一：创建配置文件并读取
* username=xxx
* password=xxx
*
* 登陆比较
*
*
*作业二：创建配置文件并读取
* userbname
*RandomAccessFile
*
*作业三：例子 各种流
*
*
*
* 线程
*
* 网络编程
*
* Swing
*
* 反射
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
* **/


import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        //泛型
        Map<String,String> maps = new HashMap<String,String>();

        //用户输入内容写到一个文件中
        Scanner scanner = new Scanner(System.in);
        File file = new File("Test.txt");
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

        //先读取原来文件的内容
        StringBuffer stringBuffer = new StringBuffer();
        int len;
        byte[] bytes = new byte[1024];
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
            while((len=fileInputStream.read(bytes)) != -1){
                stringBuffer.append(new String(bytes,0,len));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if(fileInputStream != null){
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


        //原来文件的内容
        String oldContext = stringBuffer.toString();
        String writeContext = "";
        if("".equals(oldContext)){
            writeContext = userInput+"\n";
            //writeContext = "\n"+oldContext+userInput;
        }else{
            writeContext = oldContext+userInput+"\n";
        }

        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter(file);
            fileWriter.write(writeContext);
            fileWriter.flush();//刷新缓冲区。
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if(fileWriter!=null){
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


        // write your code here
        //System.out.println("ddd");
    }
}
