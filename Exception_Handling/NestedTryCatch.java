package Exception_Handling;

public class NestedTryCatch {

	public static void main(String[] args) {
		int a[]= {0,1,2,3,4,5};
		try {
			try {
				int c = a[4]/a[0];
				System.out.println("Divivsion is "+ c);
			}
			catch(ArithmeticException e) {
				System.out.println(e);
			}
		System.out.println(a[6]);
		}
		catch(Exception e) {
			System.out.println("Array is out of bound " + e);
		}
		

	}

}
