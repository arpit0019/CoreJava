package Inheritance;

public class Bike extends Vehicle {

	private String handle;
	
	public Bike() {}
	
	public Bike(String company,String name,int engine,int wheels,int fuelTank,String lights,int seats,int mileage , String handle) {
		super(company,name,engine,wheels,fuelTank,lights,seats,mileage);
		this.handle = "Short";
	}

	public String getHandle() {
		return handle;
	}

	@Override
	public String toString() {
		return "Bike [getHandle()=" + getHandle() + ", getCompany()=" + getCompany() + ", getName()=" + getName()
				+ ", getEngine()=" + getEngine() + ", getWheels()=" + getWheels() + ", getFuelTank()=" + getFuelTank()
				+ ", getLights()=" + getLights() + ", getSeats()=" + getSeats() + ", getMileage()=" + getMileage()
				+ "]";
	}

	public void setHandle(String handle) {
		this.handle = handle;
	}
	
	public void run() {
		System.out.println(getName()+" is running");
		System.out.println(toString());
	}
	
}
