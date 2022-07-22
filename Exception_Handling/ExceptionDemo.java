package Exception_Handling;

public class ExceptionDemo {

	public static void main(String[] args) {
	
		try {
			int a=10;
			int b=0;
			int c = a/b;
					System.out.println(c);
					System.out.println("Bye");
		}
		catch(ArithmeticException e) {
			System.out.println("divide by zero" + e);
		}
	}

}
