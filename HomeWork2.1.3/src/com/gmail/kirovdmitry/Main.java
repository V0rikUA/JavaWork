package com.gmail.kirovdmitry;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введит год и нажмите \"Enter\"");
		int a = sc.nextInt();
		if (a % 400 == 0) {
			System.out.println("Год высокосный");
		} else if (a % 4 == 0) {
			System.out.println("Год высокосный");
		} else if (a % 100 == 0 && a % 400 != 0) {
			System.out.println("Год не высокосный");
		} else {
			System.out.println("Год не высокосный");
		}

	}

}
