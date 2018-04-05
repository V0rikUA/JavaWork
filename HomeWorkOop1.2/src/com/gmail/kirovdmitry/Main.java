package com.gmail.kirovdmitry;

public class Main {

	public static void main(String[] args) {
		
		Triangle abc = new Triangle(6, 7, 10);
		
		System.out.println(abc);
		
		Triangle abc1 = new Triangle();
		abc1.setA(3);
		abc1.setB(4);
		abc1.setC(5);
		
		
		System.out.println(abc1);
		
		
	}

}
