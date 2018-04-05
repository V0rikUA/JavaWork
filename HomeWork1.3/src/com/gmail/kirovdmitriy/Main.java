package com.gmail.kirovdmitriy;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	double r;
	Scanner sc=new Scanner(System.in);
	System.out.println("Input r");
	r = sc.nextDouble();
	double c = 2*Math.PI*r;
	System.out.println("C = "+(double)c);
	
	sc.close();
	}

}
