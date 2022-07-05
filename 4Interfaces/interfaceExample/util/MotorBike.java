package util;

public class MotorBike implements Drivable, Comparable{
    private int speed;
    private String name;
    @Override
    public int compareTo(Object o) {
	MotorBike bike = (MotorBike) o;
	if(this.speed == bike.speed)//if speeds are the same
	    return this.name.compareTo(bike.name);//compare by names
	return this.speed - bike.speed;//compare by speed
    }
    public MotorBike(String name) {
	speed = 0;
	this.name = name;
    }
    @Override
    public void accelerate(int value) {
	speed += value;
	
    }

    @Override
    public void brake(int value) {
	speed -= value;
    }
    @Override
    public int getSpeed() {
	return speed;
    }
    @Override
    public String toString() {
	return "Motorbike " + name;
    }
    public void ring() {
	System.out.println(toString() + " rings!");
    }
}

