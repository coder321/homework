package com.test;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by mac on 2017/5/5.
 * Socket   tcp协议
 * HTTP
 */
public class ObjectServer {
    public static void main(String[] args){
        ServerSocket serverSocket = null;
        Socket socket = null;
        try {
            serverSocket = new ServerSocket(8999);
            socket = serverSocket.accept();
            ObjectInputStream objectInputStream = new ObjectInputStream(socket.getInputStream());
            Student s = (Student) objectInputStream.readObject();
            System.out.println("客户端发来对象"+s);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
            objectOutputStream.writeObject(s);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
