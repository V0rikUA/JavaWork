package com.gmail.kirovdmitriy;

import java.io.File;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File fileOne = new File("a.txt");		////������������ �����

		try {                                   // �������� �����
			fileOne.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		File folderOne = new File("AAA");   //������������ �����
		
		folderOne.mkdirs();                // �������� ����� �� ���
		
		File fileTwo = new File(folderOne, "b.txt");  ////������������ �����
		
		try {                                 			 // �������� �����
			fileTwo.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}

		fileOne.delete();				//������� ����
		
//		fileTwo.delete();				//������� ����, � ����� �������� ����� ���������� ���� ����
		
//		folderOne.delete();
		
		deleteFile(folderOne);         // �������� ���� � �������� ����� � ������� ��������� ������ ��������
		
		File mainFolder = new File("."); // �������� ����� �������� ���������������� ���������
		File[] files = mainFolder.listFiles();
		for (File file : files) {       //����� ��� �������� ������ � ����� � �������� ����� �������
			System.out.println(file);
		}

	}
	
	public static void deleteFile(File file) {      //����� ��� ��������
		if (!file.isDirectory()) {					//���� ������ � �����
			file.delete();							//� ����� ������� �� ����� �������
		}else {
			File [] files = file.listFiles();
			for (int i = 0; i < files.length; i++) {
				deleteFile(files[i]);
			}
			file.delete();
		}
	}

}
