package com.test;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by mac on 2017/5/3.
 * 服务器端
 */
public class Main2 {
    public static void main(String[] args){
        ServerSocket serverSocket = null;//服务器端
        Socket socket = null;//标示客户端
        try {
            serverSocket = new ServerSocket(8999);
            System.out.println("服务器端创建成功，等待客户端连接");
            socket = serverSocket.accept();//等待客户端连接
            System.out.println("连接成功正在读取数据");
            //socket
            //接受客户端发来的数据
            InputStream inputStream = socket.getInputStream();
            int len = 0;
            byte[] bytes = new byte[1024];
            StringBuffer stringBuffer = new StringBuffer();
            while ((len = inputStream.read(bytes))!=-1){
                stringBuffer.append(new String(bytes,0,len));
                len=0;
            }
            System.out.println("客户端发来消息："+stringBuffer.toString());
            String s = "我已经收到消息："+stringBuffer.toString();
            //将数据发送到客户端
            System.out.println("正在向客户端返回消息");
            OutputStream outputStream = socket.getOutputStream();
            outputStream.write(s.getBytes());
            outputStream.flush();
            System.out.println("返回消息完成，消息内容为"+s);

            //outputStream.close();
            //inputStream.close();


        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            System.out.println("关闭服务器，关闭链接");
            //关闭链接
            if(socket!=null){
                if(socket.isConnected()){
                    try {
                        //socket.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
            //关闭服务器
            if(serverSocket!=null){
                if(!serverSocket.isClosed()){
                    try {
                        //serverSocket.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }

        }



    }
}
