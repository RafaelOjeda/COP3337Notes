package util;

public class ElectricBike implements Drivable{
    private int speed;
    private String name;
    public ElectricBike(String name) {
	speed = 0;
	this.name = name;
    }
    @Override
    public void accelerate(int value) {
	speed += value/2;
	//Let's say the bike is faulty 
	//and doesn't accelerate well!
	
    }

    @Override
    public void brake(int value) {
	speed -= value/2;
	//Let's say the bike is faulty 
	//and doesn't brake well!
    }
    @Override
    public int getSpeed() {
	return speed;
    }
    @Override
    public String toString() {
	return "E-bike" + name;
    }
    public void ring() {
	System.out.println(toString() + " rings!");
    }
}

