package com.test;
/*
*
*回顾：
* 面向对象
* 封装
*
* 继承
* is  a
* extends
*
*
*
*
* 多态
*
* 编译
* 运行时
*
* 接口
* public interface IManger{
*   //抽象方法
*   public  abstract int a();
*
* }
*
*
* 抽象类
* abstract class 类名称{
*
*   //普通方法
*
*   //抽象方法
*
* }
*
* 抽象类和接口都不允许 实例化对象
*
*
* abstract class Person{
*
*   //...  规定
*   public abstract void eat();
*
* }
*
* class WestPerson extends Person{
*   public void eat(){
*       //...
*   }
* }
*
* class EastPerson extends Person{
*   public void eat(){
*       //...
*   }
* }
*
*
*
*
* 异常
*
* try{
*
*
*   retrun 0;
* }catch(Exception e){
*
* }finally{
*
*
* }
*
* 作业：
*
*
*
*
*
*
* 单例模式
* 一个应用中只有一个实例
*
* 1.保证对象不能再类的外部被随意实例化
*   new
*  解决方法： 将构造器进行私有话处理
*
*
* 2.保证类创建的过程发生在类的内部
*   还要保证在类的外部能拿到在类内部初始化的对象
*
*
*
*
*
*
* java 常用类： javaAPI
* public final class String
extends Object
implements Serializable, Comparable<String>, CharSequence
*
*
*
*
* 数组不够的情况
*
* 新创建一个二倍长度的数组
* 然后将上一个数组copy到新创建的数组
*
* int[] arr  = new int[10];
*
* arr[9] = 10;
*
*
*
*
*
* */


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
//        String s = new String("abc");
//        //value  abc
//
//        //String 特点，
//        //赋值一次就会创建一个新的String 来存放
//        //以前的对象没有指向，等待被回收，
//
//        StringBuffer sb = new StringBuffer();
//        for(int i = 0;i<100000;i++){
//
//            //相当于 s+=i
//        sb.append(i);
//        }
//        Math.abs(-123);//123
//
//
//
//        System.out.print("执行完成"+sb.toString());

        //返回0----1  浮点数
        //返回 0-----10  int
        //(int)(Math.random()*10)
        //返回0----5  int
        //(int)(Math.random()*5)
        //返回0----15  int
        //(int)(Math.random()*5)
        //返回5---15  int
        //0*10+5     1*10+5
        //(int)(Math.random()*(10)+5);

        // 30---70 *40 +30
        //
        // Math.random()*(最大值-最小值)+最小值

        //作业二
        //剪子1包袱2锤3
        //和电脑比较输赢

        //作业三
        //彩票
        //一个数相同  一瓶酱油



        //System.out.println(""+(int)(Math.random()*5));

        //System.out.print(UUID.randomUUID());
//        System.out.println(new Date());
//        //日期格式化问题
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年M月d日 H时m分s秒");
//
//        System.out.println(sdf.format(new Date()));
//        Date date = new Date();
//        date.getTime();
//
//        Calendar calendar = Calendar.getInstance();
//        int year = calendar.get(Calendar.YEAR);
//
//        System.out.print("年是"+year);

//  LinkedList();
        /*
        *
        * 集合的创建
        *
        * 集合添加元素
        * 查找元素
        * 删除元素
        * 遍历元素
        * 清空
        *
        *
        * 特性
        * ：
        *
        *
        *
        * */

        //List list = new ArrayList();
        //list.add("高鑫");
        //list.get(0);
        //list.add(1123);

        //正常的FOr
        //for(int i = 0;i<list.size();i++){
            //System.out.println("长度"+list.get(i));
        //}
        //使用迭代器
        //Iterator iterator = list.iterator();
        //while (iterator.hasNext()){
            //System.out.println("元素"+iterator.next());
        //}

        //list.clear();
        //list.remove(0);
       // System.out.println("get0"+list.get(0));

       // System.out.println("长度"+list.get(0));

        //int[] a = new int[10];
        //a[0] = 10;







//        MyComparator myComparator = new MyComparator();
//        Set set = new TreeSet(myComparator);
//
//        set.add(new Student("songjun",19));
//        set.add(new Student("baoxin",15));
//        set.add(new Student("aaoxin2",15));
//
//        Iterator iterator = set.iterator();
//
//        while(iterator.hasNext()){
//            Student s = (Student) iterator.next();
//            System.out.println(s.getName()+" ----  "+s.getAge());
//        }

        //for-each 遍历
        /*
        *
        * try当中有return  finally是否会执行
        *
        *
        * ArrayList 与LinkedList  区别
        *
        *
        * HashTable 与HashMap  区别
        *
        *
        *
        *
        * ***/








        //Map< K  ,  V   >
//        Map<String,Student> maps = new HashMap<String,Student>();
//
//        maps.put("songjun",new Student("songun",19));
//        maps.put("gaoxin",new Student("gaoxun",10));
//
//        //获取元素
//        //Student student = maps.get("songjun");//   null
//        //System.out.println("名字是"+student.getName());
//
//        //maps.remove("songjun");
//        //maps.clear();
//        //map遍历
//
//        Set<String> keys = maps.keySet();
//
//        //map当中数据量比较大，推荐使用for
//        for(String s:keys){
//           System.out.print(s+"    ----"+maps.get(s));
//        }
//
//
//        Iterator iterator = keys.iterator();
//        while(iterator.hasNext()){
//            String key = (String) iterator.next();
//            //System.out.print("key is "+key);
//            //System.out.println("Key is"+key +" value is "+maps.get(key));
//
//        }


        //java io


        //maps.size();



        //Properties pps = System.getProperties();
        //pps.list(System.out);

        Properties pps = new Properties();
        pps.load(new FileInputStream("src/com/test/Test.properties"));
        Enumeration enum1 = pps.propertyNames();//得到配置文件的名字
        while(enum1.hasMoreElements()) {
            String strKey = (String) enum1.nextElement();
            String strValue = pps.getProperty(strKey);
            System.out.println(strKey + "=" + strValue);
        }

        /*
        *
        * 集合：
        *
        * List
        *
        * ArrayList
        * LinkedList
        *
        *
        * Set
        * TreeSet
        * HashSet
        *
        *
        *
        *
        * Map
        * HashMap
        * HashTable
        *
        *
        *
        *
        * Properties 读取配置信息。
        *
        *
        *
        *
        * **/


        //Array 转换成ArrayList
        List s = Arrays.asList("ww","ss","ss");
        //将ArrayList转换成Array
        //int[] aa = arraylist.toArray();












    }

    public void test(){

        final int  a = 0;
        IA ia = new IA(){
            @Override
            public int a() {
                int b = a;
                return 0;
            }
        };


    }

}
