package com.test;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //发送端(客户端)
        //接收端(服务端)
        try {
            ServerSocket serverSocket = new ServerSocket(8989);

            while(true) {
                //创建服务端  并开通注册端口
                System.out.println("服务器端创建成功");
                //监听对应端口  阻塞
                Socket sockect = serverSocket.accept();//
                System.out.println("正在监听端口");
                InputStream inputStream = sockect.getInputStream();

                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream,"UTF-8"));
                String ss = bufferedReader.readLine();

                System.out.println("服务器端：你是干什么的");
                System.out.println("客户端:"+ss);

                inputStream.close();

                String address = new String(sockect.getInetAddress().getHostName());
                System.out.print("有人来访问地址是" + address);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


//        File file = new File("test.txt");
//        if(!file.exists()){
//            try {
//                file.createNewFile();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//        String s = "songjun";
//        FileOutputStream outputStream = null;
//        try {
//            outputStream = new FileOutputStream(file);
//            outputStream.write(s.getBytes());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        FileInputStream fileInputStream = null;
//        try {
//            fileInputStream = new FileInputStream(file);
//            fileInputStream.
//        } catch (Exception e) {
//            e.printStackTrace();
//        }


    }
}
