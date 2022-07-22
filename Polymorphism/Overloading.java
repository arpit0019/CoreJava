package Polymorphism;

public class Overloading {
	public void add(int x, int y) {
		System.out.println(x+y+" is the sum");
	}
	public void add(int x, int y,int z) {
		System.out.println(x+y+z+" is the sum");
	}
	public void add(int x, int y,int z,int a) {
		System.out.println(x+y+z+a+" is the sum");
	}
	public static void main(String[] args) {
         
		Overloading o = new Overloading();
		o.add(1,1);
		o.add(1,1,1);
		o.add(1,1,1,1);
		
		

	}

}
