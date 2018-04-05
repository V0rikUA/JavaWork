package com.gmail.kirovdmitry;

public class Main {

	public static void main(String[] args) {
		int a = 5;
		int b = 6;
		int c = 7;
		if (a+b>c && a+c>b && b+c>a) {
			System.out.println("Треугольник существует");
			
		}else { 
			System.out.println("Треуголник не может существовать");
		}

	}

}
