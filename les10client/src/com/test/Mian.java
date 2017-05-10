package com.test;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * Created by mac on 2017/5/3.
 */
public class Mian {
    public static void main(String[] agrs){

        Socket socket = null;
        try {
            System.out.println("正在链接服务器");
            socket = new Socket("192.168.199.238",8999);
            String s = "hello";
            //向服务器端发送数据
            System.out.println("链接成功，正在向服务器发送数据");
            OutputStream outputStream = socket.getOutputStream();
            outputStream.write(s.getBytes());
            outputStream.flush();
            //outputStream.close();
            socket.shutdownOutput();
            //接受服务器端返回来的数据
            System.out.println("正在接受服务器返回的消息");
            InputStream inputStream = socket.getInputStream();
            int len = 0;
            byte[] bytes = new byte[1024];
            StringBuffer stringBuffer = new StringBuffer();
            while ((len = inputStream.read(bytes))!=-1){
                stringBuffer.append(new String(bytes,0,len));
            }
            System.out.println("服务器端返回内容为："+stringBuffer.toString());

            //outputStream.close();
            //inputStream.close();


        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            System.out.println("关闭链接");
            if(socket!=null){
                if(socket.isConnected()){
                    try {
                        //socket.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }


    }
}
