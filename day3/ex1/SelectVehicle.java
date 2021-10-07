package com.hsbc.automobile;

public class SelectVehicle {

	public static void main(String[] args) {
		System.out.println("KTM instance");
		Ktm ktm = new Ktm();
		AutomobileUI.printVehicle(ktm);
		System.out.println("Royal Enfield instance");
		RoyalEnfield rf = new RoyalEnfield();
		AutomobileUI.printVehicle(rf);
		System.out.println("Alto instance");
		Alto al = new Alto();
		AutomobileUI.printVehicle(al);
		System.out.println("Skoda instance");
		Skoda sk = new Skoda();
		AutomobileUI.printVehicle(sk);
		System.out.println("BMW instance");
		Bmw bmw = new Bmw();
		AutomobileUI.printVehicle(bmw);
	}

}
