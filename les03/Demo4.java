import java.util.Arrays;
import java.util.Scanner;

public class Demo4{

	public static void main(String[] ar){

		int[] arr = {1,2,3,10,127,2342,23423,54656,87211,1};
		//System.out.println("排序钱");
		for(int i = 0;i<arr.length;i++){
			//System.out.print(arr[i]+",");
		}

		//排序
		Arrays.sort(arr);

		//System.out.println("\n排序后");
		for(int i = 0;i<arr.length;i++){
			//System.out.print(arr[i]+",");
		}

		//System.out.println("");

		int[] arr2 = {1,2,3,10,127,2342,23423,54656,87211,1};
		
		/*
		boolean flog = true;

		for(int i = 0;i<arr.length;i++){
			//System.out.print(arr[i]+",");
			if（arr[i]!=arr2[i]){
				flog = false;
			}
		}

		if（flog){
			//==
		}else{
			//!=
		}*/
		// arr == arr2  ==》false
		//arr   arr2 都是数组第一个元素的地址。

		//System.out.println(Arrays.equals(arr,arr2));	

		//工具类。已经封装好的一些特定功能的方法。

		//System.out.println(Arrays.binarySearch(arr,100));	

		//作业：密码强度判断：
		//字符+数字+特殊符号，强
		//其中两项   中
		//一项   弱


		String name1 = "songjun";
		String name2 = "songjun";

		//
		for(int i = 0;i<name1.length();i++){
			//System.out.println(name1.charAt(i));
		}


		//Scanner sc = new Scanner(System.in);

		//String name3 = sc.next();
		//System.out.println(name1.length()+" , "+name3.length());

		//Arrays.equals();
		//name1.equals(name3)

		//字符串的比较都用equals()
		//把确定有值的放到前面
		//System.out.println(name1.equals(name3));

		//查找name1字符串中是否含有l字母
		name1 = name1.replace('j','l');
		System.out.println(name1+" "+name1.indexOf("l"));
		String names = "张三,李四";
		String[] namearr = names.split(",");
		for(String n:namearr){
			System.out.println(n);
		}

	}


}