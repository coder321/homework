package com.test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Main extends JFrame {

    boolean flag = true;

    public Main(){

        this.setLayout(new FlowLayout());

        Icon icon = new ImageIcon("src/3.jpg");

        JLabel jLabel = new JLabel();
        jLabel.setText("松俊看高鑫下载的图片");//要现实的内容
        jLabel.setBounds(30,30,300,100);//设置控件的位置
        jLabel.setIcon(icon);
        this.add(jLabel);//将其加入到窗口当中

        JButton jButton = new JButton();//定义控件
        jButton.setText("开始");//设置现实
        jButton.setBounds(30,100,100,20);//设置位置
        jButton.setOpaque(true);
        jButton.setBackground(Color.BLUE);

        //jButton.setForeground(Color.red);
        //jButton.setIcon(icon);
        this.add(jButton);//添加到窗口中。

        JTextArea jTextArea = new JTextArea();
        jTextArea.setText("请输入内容");
        jTextArea.setBounds(30,70,100,20);
        this.add(jTextArea);
        JPasswordField jPasswordField = new JPasswordField();
        jPasswordField.setText("111");
        this.add(jPasswordField);

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.print(e.getID()+"   "+e.getSource());
                JButton jButton1 = (JButton) e.getSource();
                jButton1.setText("结束");
                System.out.println("老师说：着火了，");
                jLabel.setText(jPasswordField.getText());


                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        int i =0;
                        while (flag){
                            i++;
                            try {
                                Thread.sleep(500);
                            } catch (InterruptedException e1) {
                                e1.printStackTrace();
                            }
                            jLabel.setText(i+"");
                        }
                    }
                }).start();
                if(flag == true) {
                    flag = false;
                }else {
                    flag = true;
                }
                //IO流
                //作业一：记事本，（将菜单项加入时间）
                //作业二：产生随机数的（5--100），





            }
        });

        //this.setBackground(Color.darkGray);

        //加入菜单
        JMenuBar jMenuBar = new JMenuBar();

        JMenu jMenu = new JMenu();
        jMenu.setText("文件");
        JMenu jMenu1 = new JMenu();
        jMenu1.setText("编辑");

        JMenuItem jMenuItem = new JMenuItem();
        jMenuItem.setText("新建");

        jMenu.add(jMenuItem);
        jMenuBar.add(jMenu);
        jMenuBar.add(jMenu1);
        this.setJMenuBar(jMenuBar);





        this.setTitle("红宝和绿宝");
        this.setBounds(100,100,300,300);//设置窗口的位置
        this.setVisible(true);//设置窗口是否显示


    }

    public static void main(String[] args) {
	// write your code here
        new Main();

    }
}
