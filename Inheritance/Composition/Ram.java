package Inheritance.Composition;

public class Ram {

	
	private String brand;
	private String memory;
	
	public Ram() {
		this.brand = "intel";
		this.memory ="4GB";
	}
	
	public Ram(String brand, String memory ) {
		
		this.brand = brand;
		this.memory = memory;
	}

	@Override
	public String toString() {
		return "Ram [brand=" + brand + ", memory=" + memory + "]";
	}

	

	
	
	
}
