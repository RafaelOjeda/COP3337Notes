package util;

public class Car implements Drivable{
    private int speed;
    private String name;
    public Car(String name) {
	speed = 0;
	this.name = name;
    }
    @Override
    public void accelerate(int value) {
	speed += value;
	
    }
    @Override
    public void brake(int value) {
	// TODO Auto-generated method stub
	speed -= value;
    }
    @Override
    public int getSpeed() {
	// TODO Auto-generated method stub
	return speed;
    }
    public int getSpeedInKmph() {
	return (int)Math.round(speed * MILE_TO_KM);
    }
    @Override
    public String toString() {
	return "Car " + name;
    }
    public void honk() {
	System.out.println(toString() + " honks!");
    }
}

