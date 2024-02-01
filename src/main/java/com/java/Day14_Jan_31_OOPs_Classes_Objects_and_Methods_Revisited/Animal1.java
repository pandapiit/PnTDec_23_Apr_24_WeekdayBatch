package com.java.Day14_Jan_31_OOPs_Classes_Objects_and_Methods_Revisited;

public class Animal1 {
	
	//Initalize the object with the help of reference variable

	public static void main(String[] args) {
		
      Animal1 buzzo = new Animal1();
      buzzo.eat();
      buzzo.sleep();
      
      Birds moti = new Birds();
      moti.fly();
      moti.hunt();
      
      Fish nemo = new Fish();
      nemo.swim();
      nemo.eggs();
      
	}
	
	
	public void eat() {
		System.out.println("Dog is eating");
	}
	
	public void sleep() {
		System.out.println("Dog is sleeping");
	}

}

class Birds{
	
	public void fly() {
		System.out.println("Eagle Flying");
	}
	
	public void hunt() {
		System.out.println("Eagle hunting");
	}
}

class Fish{
	public void swim() {
		System.out.println("Nemo Swimming");
	}
	
	public void eggs() {
		System.out.println("Nemo giving eggs");
	}
}
