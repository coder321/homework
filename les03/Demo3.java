

public class Demo3{

	public static void main(String[] args){
		int[] a = new int[]{1,2};
		//输出的位置都在主方法当中
		for(int i =0;i<2;i++){
			System.out.println("方法调用前"+a[i]);
		}
		swap(a);
		for(int i =0;i<2;i++){
			System.out.println("方法调用后"+a[i]);
		}

	}

	public static void swap(int[] a){
		int t = a[0];
		a[0] = a[1];
		a[1] = t;
	}


}