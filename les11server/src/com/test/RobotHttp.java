package com.test;



import jdk.nashorn.internal.parser.JSONParser;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

/**
 * Created by mac on 2017/5/5.
 */
public class RobotHttp {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(true){
            String userTalk = scanner.next();
            //URL
            //String url = "http://t1.27270.com/uploads/150609/7-1506091506401R.jpg";
            String url = "http://www.tuling123.com/openapi/api?key=23a5b99fa16f6feb7db9298fa4435c3b&info="+userTalk;
            try {
                //创建URL对象
                URL url1 = new URL(url);
                //打开URL
                URLConnection urlConnection = url1.openConnection();
                //发起请求链接
                urlConnection.connect();
                //获取返回内容
                //下载图片
    //            InputStream inputStream = urlConnection.getInputStream();
    //            byte[] bytes = new byte[1024];
    //            int len = 0;
    //            File file = new File("1.jpg");
    //            FileOutputStream fileOutputStream = new FileOutputStream(file);
    //            while((len=inputStream.read(bytes))!=-1){
    //                fileOutputStream.write(bytes,0,len);
    //            }


                //读取元文件
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
                StringBuffer stringBuffer = new StringBuffer();
                String s = "";
                s = bufferedReader.readLine();
                //JSONObject jsonObject = new JSONObject(s);
                String[] strings = s.split(":");
                String[] strings1 = strings[2].split("\"");


                System.out.println(strings1[1]);

                //System.out.println(bufferedReader.readLine());

                /**
                 *
                 * JSON 数据格式
                 * {"code":100000,"text":"宿舍里放着，家里没开网喔"}
                 *
                 * JSON数据解析  java
                 * */





                //bufferedReader.readLine();



            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }


}
