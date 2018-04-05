package com.gmail.kirovdmitriy;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int a;
		int b;
		int c;
		int d;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Input 1 of 4 numbers");
		a=sc.nextInt();
		System.out.println("Input 2 of 4 numbers");
		b=sc.nextInt();
		System.out.println("Input 3 of 4 numbers");
		c=sc.nextInt();
		System.out.println("Input 4 of 4 numbers");
		d=sc.nextInt();
		
		int max=a;
		if (b>max) {
			max=b;
		}else if (c>max) {
			max=c;
		}else if (d>max) {
			max=d;
		}
		 System.out.println("Biggest one is "+max);
		sc.close();
	}

}
