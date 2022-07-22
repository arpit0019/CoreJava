package DataStructure.Array;

public class MinMaxInArray {

	public static void main(String[] args) {
		int A[] = {3, 2, 1, 56, 10000, 167};
		int[] y = check(A); 
		System.out.println(y[0] +"  "+y[1]);
	}
	
	public static int[] check(int[] a) {
		int[] x = new int[2];
		int max =0;
		for(int i=0 ; i<a.length ; i++) {
			if(a[i]>max) {
				max = a[i];
			}
		}
		x[1] = max;
		int min=max ;
		for(int i=0 ; i<a.length ; i++) {
			if(a[i]<min) {
				min = a[i];
			}
		}
		x[0]=min;
		
		
		return x;
	}

}
