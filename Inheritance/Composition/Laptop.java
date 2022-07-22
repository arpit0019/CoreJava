package Inheritance.Composition;

public class Laptop {

	private String screen;
	private Ram r1;
	private String mouse;
	private String keyboard;
	
	public Laptop() {
	this.screen = "HP";
	this.r1 = new Ram();
	this.mouse = "HP";
	this.keyboard = "HP";}
	
	
	public Laptop(String screen, Ram ram, String mouse, String keyboard) {
		super();
		this.screen = screen;
		this.r1 = ram;
		this.mouse = mouse;
		this.keyboard = keyboard;
	}


	@Override
	public String toString() {
		return "Laptop [screen=" + screen + ", ram=" + r1 + ", mouse=" + mouse + ", keyboard=" + keyboard + "]";
	}
	
	
}
