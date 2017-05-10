/*
冒泡排序

*/

public class Demo{

	public static void main(String[] args){
		int[] a = new int[]{2,4,3,1,6,5,7,8,9};
		int i ,j ;
		for(i=0;i<9;i++){
			for(j=0;j<8;j++){
				if(a[j]<a[j+1]){
					int b = a[j+1];
					a[j+1] = a[j];
					a[j] = b;
				}
			}

		}
		for(i=0;i<9;i++){
			System.out.println(a[i]);
		}
			
	}

}