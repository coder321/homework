package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by mac on 2017/5/3.
 * 作业一：用字节流和字符流分别实现客户端发送 服务器端返回
 *
 * 作业二：服务器端实现服务多客户端。
 *
 * 作业三：实现群发消息(备注谁说的话)。
 * 在链接服务器的时候，我们告诉服务器自己叫什么，
 *
 * 作业四：点对点聊天。
 *
 * 作业四：实现收发对象   对象流
 */
public class Server {
    public static void main(String[] args){

        ServerSocket serverSocket = null;
        Socket socket = null;
        List<Socket> list = new ArrayList<Socket>();
        Map<String,Socket> socketHashMap = new HashMap<String,Socket>();
        try {
            serverSocket = new ServerSocket(8999);

            while (true) {
                socket = serverSocket.accept();

                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                String name = bufferedReader.readLine();
                socketHashMap.put(name,socket);//映射名字和客户端。
                list.add(socket);
                new Thread(new ClientRunnable(socket,list,socketHashMap)).start();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
