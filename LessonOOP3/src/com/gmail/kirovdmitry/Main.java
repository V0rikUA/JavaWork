package com.gmail.kirovdmitry;

public class Main {

	public static void main(String[] args) {
		int a = div(5, 1);
		System.out.println(a);
	}

	public static int div(int a, int b) {
		int c;
		try {
			c = a / b;
		} catch (ArithmeticException e) {
			c = Integer.MAX_VALUE;
			e.printStackTrace();
			return c;

		} finally {
			System.out.println("Finally work");
		}

		return c;
	}
}
