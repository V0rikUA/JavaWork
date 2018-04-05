package com.gmail.kirovdmitry;

public class Main {

	public static void main(String[] args) {
		Car carOne = new Car();
		carOne.setColor("Blue"); 
		carOne.setWeight(1500);
		carOne.setYear(1990);
		carOne.beep();
		carOne.acceleration(0);

		System.out.println();

		Car carTwo = new Car("Red", 3500, 2010);
		
		System.out.println(carOne);
		System.out.println(carTwo);
	}

}
