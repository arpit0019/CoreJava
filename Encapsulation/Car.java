package Encapsulation;

public class Car {

private int wheels;
private String name;
private String model;
private int speed;
private String color ;

public String getColor() {
	return color;
}

public void setColor(String color) {
	this.color = color;
}

public void setWheels(int wheels) {
	this.wheels = wheels;
}

public int getWheels() {
	return wheels;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getModel() {
	return model;
}

public void setModel(String model) {
	this.model = model;
}

public int getSpeed() {
	return speed;
}

public void setSpeed(int speed) {
	this.speed = speed;
}

}
