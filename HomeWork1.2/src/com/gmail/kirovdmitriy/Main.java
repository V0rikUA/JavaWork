package com.gmail.kirovdmitriy;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double a;
		double b;
		double c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите сторону \"А\" ");
		a = sc.nextDouble();
		System.out.println("Введите сторону \"B\" ");
		b = sc.nextDouble();
		System.out.println("Введите сторону \"C\" ");
		c = sc.nextDouble();
		double p = 0.5*(a+b+c);
		double h=Math.sqrt(p*(p-a)*(p-b)*(p-c));
		h= Math.round(h);
		System.out.println("Площадь треугольника  "+h+" см.");
		
		sc.close(); 
	}

}
