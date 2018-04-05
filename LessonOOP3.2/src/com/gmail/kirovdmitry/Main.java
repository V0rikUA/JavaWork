package com.gmail.kirovdmitry;

public class Main {

	public static void main(String[] args) {
		System.out.println(calculateAre(6));
	}

	public static double calculateAre(double r) {
		if (r < 0) {
			throw new IllegalArgumentException("Negative radius");
		}

		return Math.PI * r * r;
	}
}
