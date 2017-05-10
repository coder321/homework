package com.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by mac on 2017/5/3.
 */
public class OutRunnable implements Runnable {
    Socket socket = null;
    public OutRunnable(Socket socket){
        this.socket = socket;
    }


    @Override
    public void run() {
        while (true) {
            Scanner scanner = new Scanner(System.in);


            System.out.println("请输入内容");
            String neirong = scanner.next();
            System.out.println("用户输入的内容是" + neirong);
            System.out.println("正在发送");

            PrintWriter printWriter = null;
            try {
                printWriter = new PrintWriter(socket.getOutputStream());
            } catch (IOException e) {
                e.printStackTrace();
            }
            printWriter.write(neirong + "\n");
            printWriter.flush();
        }
    }
}
