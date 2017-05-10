package com.test;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by mac on 2017/5/3.
 */
public class Client {
    public static void main(String[] args){

        Socket socket = null;

        try {
            socket = new Socket("192.168.199.238",8999);
            PrintWriter printWriter = new PrintWriter(socket.getOutputStream());
            printWriter.write("✈️666\n");
            printWriter.flush();

            //发
            new Thread(new OutRunnable(socket)).start();
            //收
            new Thread(new InRunnable(socket)).start();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
