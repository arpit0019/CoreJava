package Inheritance;

public class Vehicle {

	private String company;
	private String name;
	private int engine;
	private int wheels;
	private int fuelTank;
	private String lights;
	private int seats;
	private int mileage;
	
	public Vehicle() {}
	
	public Vehicle(String company,String name,int engine,int wheels,int fuelTank,String lights,int seats,int mileage) {
		this.company = company;
		this.name=name;
		 this.engine=engine;
		 this.wheels=engine;
		 this.fuelTank=engine;
		 this.lights = lights;
		 this.seats =seats;
		 this.mileage = mileage;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEngine() {
		return engine;
	}

	public void setEngine(int engine) {
		this.engine = engine;
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public int getFuelTank() {
		return fuelTank;
	}

	public void setFuelTank(int fuelTank) {
		this.fuelTank = fuelTank;
	}

	public String getLights() {
		return lights;
	}

	public void setLights(String lights) {
		this.lights = lights;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	public void run() {
		System.out.println("Running");
	}

}
