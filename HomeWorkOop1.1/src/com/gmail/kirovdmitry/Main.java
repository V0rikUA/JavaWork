package com.gmail.kirovdmitry;

public class Main {

	public static void main(String[] args) {
		
		Cat catOne = new Cat("Metis", 2.5, 13, 24);
		
		System.out.println(catOne);

		Cat catTwo = new Cat();
		catTwo.setAge(3);
		catTwo.setColor("Grey");
		catTwo.setLenght(40);
		catTwo.setWeight(18);
		
		System.out.println(catTwo);
	}

}
