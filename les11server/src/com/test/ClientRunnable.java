package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by mac on 2017/5/3.
 */
public class ClientRunnable implements Runnable {

    Socket socket = null;
    List<Socket> sockets;
    Map<String,Socket> socketHashMap = new HashMap<String,Socket>();
    public ClientRunnable(Socket socket,List<Socket> sockets,Map<String,Socket> socketHashMap){
        this.socket = socket;
        this.sockets = sockets;
        this.socketHashMap = socketHashMap;

    }

    @Override
    public void run() {
        while (true) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                String xiaoxi = null;

                xiaoxi = bufferedReader.readLine();

                //查找是谁发送的
                Set<String> keys = socketHashMap.keySet();
                String name = "";
                for(String s:keys){
                    Socket so = socketHashMap.get(s);
                    if(socket==so){
                        name = s;
                    }
                }
                System.out.println("客户端返回内容为" + xiaoxi);
                String s = name+"说：" + xiaoxi;
                for(Socket socket1:sockets) {
                    PrintWriter printWriter = new PrintWriter(socket1.getOutputStream());
                    printWriter.write(s + "\n");
                    printWriter.flush();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}
