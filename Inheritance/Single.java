package Inheritance;


 class D{
	 int z;
		
	   public void addition(int x, int y) {
	      z = x + y;
	      System.out.println("The sum of the given numbers:"+z);
	   }
		
	  
 }

class Single extends D {
	int z;
	 public void Multiplication(int x, int y) {
	      z = x * y;
	      System.out.println("The product of given numbers:"+z);
	   }
public static void main(String[] args) {
	Single s = new Single();
	s.addition(4, 5);
	s.Multiplication(4, 5);
}
	
	
}