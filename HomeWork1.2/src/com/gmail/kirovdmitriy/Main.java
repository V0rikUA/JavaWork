package com.gmail.kirovdmitriy;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double a;
		double b;
		double c;
		Scanner sc = new Scanner(System.in);
		System.out.println("������� ������� \"�\" ");
		a = sc.nextDouble();
		System.out.println("������� ������� \"B\" ");
		b = sc.nextDouble();
		System.out.println("������� ������� \"C\" ");
		c = sc.nextDouble();
		double p = 0.5*(a+b+c);
		double h=Math.sqrt(p*(p-a)*(p-b)*(p-c));
		h= Math.round(h);
		System.out.println("������� ������������  "+h+" ��.");
		
		sc.close(); 
	}

}
