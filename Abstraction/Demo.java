package Abstraction;

public class Demo {

	public static void main(String[] args) {
	Person arpit = new Vegan();
	arpit.speak();
	arpit.eat();
	System.out.println("########################################");
	Person arpt = new NonVegan();
	arpt.speak();
	arpt.eat();
}
}