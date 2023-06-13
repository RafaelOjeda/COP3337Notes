package driver;

import java.util.*;
import util.*;

public class Main {
	public static void main(String[] args) {
		MotorBike[] myBikes = new MotorBike[] {
				new MotorBike("First Bike"), new MotorBike("Second Bike"),
				new MotorBike("Third Bike"), new MotorBike("Fourth Bike"),
				new MotorBike("Fifth Bike") };
		myBikes[0].accelerate(10);
		myBikes[3].accelerate(10);
		myBikes[4].accelerate(10);
		Arrays.sort(myBikes);
		System.out.println("After Sorting: ");
		for (MotorBike bike : myBikes) {
			System.out.println(bike);
		}

		ArrayList<Drivable> vehicles = new ArrayList<Drivable>();
		vehicles.add(new Car("John's Honda Civic 2002"));
		vehicles.add(new ElectricBike("Ann's Supercool Brand-New Electric Bike"));
		vehicles.add(new Car("Rose's Toyota Corolla 2022"));
		vehicles.add(new ElectricBike("Bob's Expensive Electric Bike"));
		for (Drivable item : vehicles)
			System.out.println(item);
		Drivable temp = vehicles.get(1);
		temp.accelerate(20);
		System.out.println("Speed of " + temp + "After accelerating 20 miles is " +
				temp.getSpeed());
		temp = vehicles.get(2);
		temp.accelerate(20);
		System.out.println("Speed of " + temp + "After accelerating 20 miles is " +
				temp.getSpeed());
	}
}
