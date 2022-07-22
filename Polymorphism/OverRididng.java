package Polymorphism;

class Phone{
	String name;

	
	public void run() {
		System.out.println("Phone is running");
	}
	
}
class Samsung extends Phone{
	String name ;
	Samsung(String name){this.name = name;}
	public void run() {
		System.out.println(this.name+" is running in samsung class");
	}
}
class Nokia extends Phone{
	String name ;
	Nokia(String name){this.name=name;}
	public void run() {
		System.out.println(this.name+" is running in Nokia class");
	}
}

public class OverRididng {
public static void main(String[] args) {
	Phone s1 = new Samsung("Note 8");
	s1.run();
	
	Phone n1 = new Nokia("Nokia 3310");
	n1.run();
	
	
}
}
