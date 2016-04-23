package Inheritance;

public class Car extends Machine {

	public void start() {

		System.out.println("Car Started...");
		
	}

	public void wiper() {

		System.out.println("Wiping...");
	}

	public void showInfo() {

		System.out.println("Type of Car: " + info);
	}

	public void stop() {

		System.out.println("Car Stopped...");
	}

}
