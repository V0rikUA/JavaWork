package com.gmail.kirovdmitry;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.println("¬ведите п€тизначное число");
		a = sc.nextInt();

		int numb1 = a/10000;
		System.out.println(numb1);
		
		int numb2 = a%10000/1000;
		System.out.println(numb2);
		
		int numb3 = a%1000/100;
		System.out.println(numb3);
		
		int numb4 = a%100/10;
		System.out.println(numb4);
		
		int numb5 = a%10;
		System.out.println(numb5);
		
		sc.close();
	}

}
