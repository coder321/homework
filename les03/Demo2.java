


public class Demo2{
	public static void main(String[] args){

		int a=10,b=12;
		System.out.println("调用方法之前是：a="+a+"，b是"+b);

		swap(a,b);
		System.out.println("调用方法之后是：a="+a+"，b是"+b);
	}
	public static void swap(int a,int b){

		int t = a;
		a = b;
		b =t;
		//System.out.println("调用方法之中是：a="+a+"，b是"+b);

	}


}