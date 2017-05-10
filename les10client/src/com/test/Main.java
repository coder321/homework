package com.test;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Main {

    public static void main(String[] args) {
	// write your code here
        try {
            //
            Socket socket = new Socket("192.168.199.238",8989);
            //socket.connect();
            System.out.println("是否连接成功"+socket.isConnected());
            OutputStream outputStream = socket.getOutputStream();
            outputStream.write("我是宋煎饼的".getBytes());
            outputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
