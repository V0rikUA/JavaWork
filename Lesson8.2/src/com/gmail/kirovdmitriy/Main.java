package com.gmail.kirovdmitriy;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		File file = new File("src/com/gmail/kirovdmitriy/Main.java");
		String text = loadTextFromFile(file);
		System.out.println(text);
	}

	public static String loadTextFromFile(File file) {
		StringBuilder sb = new StringBuilder();
		try (Scanner sc = new Scanner(file)) {
			for (; sc.hasNextLine();) {
				sb.append(sc.nextLine());
				sb.append(System.lineSeparator());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return sb.toString();
	}

}
