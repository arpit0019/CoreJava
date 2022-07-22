package Inheritance;

class A{
	int z;
	public void add(int x, int y) {
		z = x+y;
		System.out.println("sum of the numbers is:"+z);
	}
}

class B extends A{
	int z;
	public void sub(int x, int y) {
		z = x-y;
		System.out.println("difference of the numbers is:"+z);
	}
}

class C extends B{
	int z;
	public void mul(int x, int y) {
		z = x*y;
		System.out.println("product of the numbers is:"+z);
	}
}


public class Multiple extends C {

	public static void main(String[] args) {
		Multiple m = new Multiple();
		m.add(4, 4);
		m.sub(10, 5);
		m.mul(4, 6);
	}

}
