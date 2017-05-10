package com.test;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * Created by mac on 2017/5/5.
 */
public class ObjectClient {

    public static void main(String[] args){

        Socket socket = null;
        try {
            socket = new Socket("192.168.199.238",8999);
            OutputStream outputStream = socket.getOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(new Student("宋军",11));

            ObjectInputStream objectInputStream = new ObjectInputStream(socket.getInputStream());
            Student student = (Student) objectInputStream.readObject();
            System.out.print(student);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}
