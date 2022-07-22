package Encapsulation;

public class Human {

	private String name;
	private int eyes;
	private int legs;
	private int hands;
	
	public Human() {
		
	}
	
	public Human(String name ,int eyes , int legs , int hands) {
		this.name = name;
		this.eyes = eyes;
		this.legs = legs;
		this.hands = hands;
	}
	
	public int getEyes() {
		return eyes;
	}

	public int getLegs() {
		return legs;
	}

	public int getHands() {
		return hands;
	}

	public String getName() {
		return name;
	}
	
	public void isHuman() {
		if(legs==2&&eyes==2&&hands==2) {
			System.out.println(" congratulations you are Human");
		}
		else {
			System.out.println("you are not human");
		}
	}
	
}
