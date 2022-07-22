package DataStructure.Array;
import java.util.Arrays;



public class MissingElement {

	public static void main(String[] args) {
		int[] a= {5,6,2,3,8};
		int [] b = new int[20];
		
		for(int i :a) {
			b[i] = 1;
		}
		
		for(int i =0 ; i<b.length ; i++) {
			if(b[i]==1) {
				continue;
			}
			System.out.println(i);
		}
		
		
	}
}