package com.gmail.kirovdmitriy;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		sb.append("Hello");
		sb.append(" world");

		sb.insert(5, " my");

		sb.reverse();

		String text = sb.toString();
		System.out.println(text);
		
		int n = 2;
		
		String result = String.format("%."+n+"f", Math.PI);
		
//		String result = String.format("%.4f", Math.PI);
		
		System.out.println(result);

	}

}
