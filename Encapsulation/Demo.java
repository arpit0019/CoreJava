package Encapsulation;

public class Demo {

	public static void main(String[] args) {
		Car c = new Car();
		
		c.setName("Ferrari");
		System.out.println("Name of the car is "+c.getName());
		
		c.setModel("2020");
		System.out.println("Model of the car is "+c.getModel());
		
		c.setWheels(4);
		System.out.println("Number of wheels are "+c.getWheels());
		
		c.setSpeed(345);
		System.out.println("Top speed of the car is "+c.getSpeed());
	
		c.setColor("Red");
		System.out.println("Color of the car is " + c.getColor());
	}

}
