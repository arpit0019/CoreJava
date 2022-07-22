package Inheritance;

public class Car extends Vehicle {

	private String handle;
	private String musicSystem;
	private int seatBelts;
	private int ac;
	private int fridge;
	
	public Car() {
		super();
	}
	
	public Car(String company,String name,int engine,int wheels,int fuelTank,String lights,int seats,int mileage,String handle,String musicSystem, int seatBelts, int ac,int fridge) {
		super(company,name,engine,wheels,fuelTank,lights,seats,mileage);
		this.handle = handle;
		this.musicSystem = musicSystem;
		this.seatBelts = seatBelts;
		this.ac = ac;
		this.fridge = fridge;
	}



	public String getHandle() {
		return handle;
	}

	public void setHandle(String handle) {
		this.handle = handle;
	}

	public String getMusicSystem() {
		return musicSystem;
	}

	public void setMusicSystem(String musicSystem) {
		this.musicSystem = musicSystem;
	}

	public int getSeatBelts() {
		return seatBelts;
	}

	public void setSeatBelts(int seatBelts) {
		this.seatBelts = seatBelts;
	}

	public int getAc() {
		return ac;
	}

	public void setAc(int ac) {
		this.ac = ac;
	}

	public int getFridge() {
		return fridge;
	}

	public void setFridge(int fridge) {
		this.fridge = fridge;
	}

	@Override
	public String toString() {
		return "Car [getHandle()=" + getHandle() + ", getMusicSystem()=" + getMusicSystem() + ", getSeatBelts()="
				+ getSeatBelts() + ", getAc()=" + getAc() + ", getFridge()=" + getFridge() + ", getCompany()="
				+ getCompany() + ", getName()=" + getName() + ", getEngine()=" + getEngine() + ", getWheels()="
				+ getWheels() + ", getFuelTank()=" + getFuelTank() + ", getLights()=" + getLights() + ", getSeats()="
				+ getSeats() + ", getMileage()=" + getMileage() + "]";
	}
	public void run() {
		System.out.println(getName()+" is running");
		System.out.println(toString());
	}
	
}
