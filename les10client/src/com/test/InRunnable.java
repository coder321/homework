package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * Created by mac on 2017/5/3.
 * 输入线程
 * 创建线程相关输入操作
 * ThreadLocal操作
 *
 * Created by mac on 2017/5/3
 * Created by mac on 2017/5/3
 * Created by mac on 2017/5/3
 * Created by mac on 2017/5/3
 * Created by mac on 2017/5/3
 * Created by mac on
 *
 *
 *
 */
public class InRunnable implements Runnable {
    Socket socket = null;
    public InRunnable(Socket socket){
        this.socket = socket;
    }


    @Override
    public void run() {
        while (true){
            BufferedReader bufferedReader = null;
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            } catch (IOException e) {
                e.printStackTrace();
            }
            String fanhui = null;
            try {
                fanhui = bufferedReader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("服务器端返回消息为" + fanhui);
        }
    }
}
