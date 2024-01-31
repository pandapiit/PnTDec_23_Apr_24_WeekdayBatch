package com.java.Day13_Jan_30_OOPs_Part2_Objects;

public class Assignment2 {
	
	static int no_of_wheels = 4;
	static String brandName = "Ford";
	
	int front_lights = 2;
	String steeringWheelType = "Telescopic";

	public static void main(String[] args) {
		autoStart();
		cruiseControl();
		regenerativeBrakeEnergy();
		
		Assignment2 assignment = new Assignment2();
		assignment.braking();
		assignment.oilChange();
		assignment.accelaration();
		assignment.autoStart();
		assignment.cruiseControl();
		assignment.regenerativeBrakeEnergy();

	}
	
	public static void autoStart() {
		System.out.println("Auto Start with brake pressed");
		cruiseControl();
	}
	
	public static void cruiseControl() {
		System.out.println("Cruise Control at 80mph");
		regenerativeBrakeEnergy();
	}
	
	public static void regenerativeBrakeEnergy() {
		System.out.println("Brake charges Hybrid battery");
		cruiseControl();
		autoStart();
	}
	
	public void braking() {
		System.out.println("This is braking");
		accelaration();
		oilChange();
	}
	
	public void accelaration() {
		System.out.println("This is acceleration");
		oilChange();
		braking();
	}
	
	public void oilChange() {
		System.out.println("This is oil change");
		braking();
		accelaration();
	}

}
