package com.gmail.kirovdmitriy;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("a.txt");
		

		String[] names = new String[] { "Luck", "Dart", "Xan", "Yoda" };
		String[] lastName = new String[] { "SkayWalker", "Waider", "Solo", "Master" };
		int[] moneys = new int[] { 10000, -100, 500, 0 };

		String text = getInfo(names, lastName, moneys);
		
		saveStringToFile(text, file);
	}

	public static void saveStringToFile(String text, File file) { // ����� ������ ����-�� � ����
		try (PrintWriter pw = new PrintWriter(file)) {
			pw.println(text);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static String getInfo(String[] names, String[] lastName, int[] moneys) {  //����(�����) ���� ��������������� ���������� � ���������� �� �������
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < moneys.length; i++) {
			sb.append(names[i] + "," + lastName[i] + "," + moneys[i]);
			sb.append(System.lineSeparator());
		}
		return sb.toString();
	}

}
