package com.gmail.kirovdmitriy;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int floor = 9; // Number of floors
		int apartment = 4; // Apartments per one floor
		int entrance = 4; // Entrance per one building
		int total = 9 * 4 * 4; // Total apartments per one building
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if (0 < a && a <= total) {
			double b = Math.ceil(((double) a / apartment) % 9);
			if (b == 0) {
				b = 9;
			}
			double c = Math.ceil(((double) a / apartment)/floor);
			System.out.println("Your apartment is at "+(int)b+" floor in "+(int)c+" entrance.");
		} else {
			System.out.println("There is no such apartment in this bouilding");
		}

	}

}

