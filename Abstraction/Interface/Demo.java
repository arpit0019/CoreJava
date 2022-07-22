package Abstraction.Interface;

public class Demo {

	public static void main(String[] args) {

		Phone p1 = new OnePlus();
		System.out.println("memory:"+p1.memory());
		System.out.println("Operating System:"+p1.os());
		System.out.println("Processor:"+p1.processor());
		
	}

}
