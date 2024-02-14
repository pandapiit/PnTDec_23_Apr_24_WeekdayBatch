package com.java.Day17_Feb_13_OOPs_Encapsulation;

public class Circle {
	
	private double radius;
	private double pivalue;
	
	public void setAreaOfCircle(double radius, double pivalue) {
		this.radius = radius;
		this.pivalue = pivalue;
		
	}
	
	public double getAreaOfCircle() {
		double area = pivalue * (radius*radius);
		System.out.println("The area of the circle is : " + area);
		return area;
	}

}
