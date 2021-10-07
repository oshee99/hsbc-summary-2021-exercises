package com.hsbc.automobile;

// this should not know which object it uses
public class AutomobileUI {
	public static void printVehicle(Vehicle vehicle) {
		vehicle.wheels();
		System.out.println("Mileage: "+vehicle.getMileage());
		System.out.println("Price: "+vehicle.getPrice());
	}
}
