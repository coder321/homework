package com.test;

import java.io.Serializable;

/**
 * Created by mac on 2017/5/5.
 */
public class Message implements Serializable {
    private  String toName;//接收人的名字ID
    private String fromName;//发送人的名字
    private String message;//盛放消息内容
    private int type;//消息类型 1：群发2：单发3 发送文件
}
