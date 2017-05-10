/**

1.java体系：
J2SE   桌面以及服务器应用
J2EE   WEB开发
J2ME   嵌入式手持设备开发
2.语言特性：
简单性：
跨平台
多线程
面向对象
安全性

3.为什么能跨平台：
JAVA应用程序
java虚拟机(API)-->针对不同平台产生的软件
操作系统
底层硬件

JVM 可执行文件为 class(字节码)

开发java应用程序，需要安装开发环境
JDK -> JRE->JVM

不需要做开发，只需要运行java程序
只需要安装JRE即可。

4.java的运行原理：
java(源文件)
编译：class文件（字节码文件）
javac MyFirstApp.java
完成之后会在当前目录面出现
    MyFirstApp.class
运行class 文件
java MyFirstApp

JVM
API <== 操作系统和底层沟通




在一个源文件档中，有且只能有一个类文件是被pubic修饰的，
不提倡在一个源文件当中出现多个类（匿名类）

在一个源文件当中如果有多个类的定义，
那么编译完成之后会产生多个字节码文件


类名称第一个字母必须大写。

语句要写在方法体里


Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 10
	at Test.main(Test.java:71)

01111111_11111111_11111111_11111111
+                                 1
-----------------------------------
 0000000000000000000000000000000000

程序-->JAVAAPI -->JVM -->操作系统

作业：
1.输入两个数计算出加减乘除的结果.

2.输入两个数，选择需要的结果.



*/
//引入文件
import java.util.Scanner;

public class Test{

	//System.out.println("猜一下");

	static int a;//成员变量
	//static int a;

	public static void main(String[] args){
		System.out.println("HELLO"+a);
		int a  = 100;//局部变量  必须进行初始化；
		char c = '中';//java unicode编码

		System.out.println("HELLO"+a);
		int[] as= new int[10];

		//as[10] = 10;
		for(int i = 0;i<10;i++){
			//System.out.println("数组元素是"+as[i]);
		}
		//----------------------
		char[] cs = new char[10];
		cs[6] ='中';
		for(int j = 0;j<10;j++){

			//System.out.print("数组元素是"+cs[j]+"\t");
		}

		// 字符串型   引用数据类型   类
		String name = "张三你中午吃了什么？安仁坊会儿啊很过分";
		System.out.println("请输入一个数");
		//int ff = 123L;	
		//float dd = 3.14f;
		Scanner sc = new Scanner(System.in);
		for(int x = 0;x<10;x++){
			System.out.println("请输入第"+(x+1)+"数");
		
			int t = sc.nextInt();
			as[x] = t;
		}
		//int sca = sc.nextInt();
		//System.out.println("刚刚输入的是"+sca);

		for(int i = 0;i<10;i++){
			System.out.println("数组元素是"+as[i]);
		}
	}
	//static int b = 111;
		
}












