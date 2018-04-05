package com.gmail.kirovdmitriy;

import java.io.File;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File fileOne = new File("a.txt");		////Иницализация файла

		try {                                   // Создание файла
			fileOne.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		File folderOne = new File("AAA");   //Иницализация папки
		
		folderOne.mkdirs();                // Создание папки на ХДД
		
		File fileTwo = new File(folderOne, "b.txt");  ////Иницализация файла
		
		try {                                 			 // Создание файла
			fileTwo.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}

		fileOne.delete();				//Удалить файл
		
//		fileTwo.delete();				//Удалить файл, а затем удаление папки содержащей этот файл
		
//		folderOne.delete();
		
		deleteFile(folderOne);         // Удаление паки с вложеным фалом с помощью описаного метода удаления
		
		File mainFolder = new File("."); // Корневой адрес каталога инициализирующей программы
		File[] files = mainFolder.listFiles();
		for (File file : files) {       //Цикла для перебора файлов и папок в корневой папке проекта
			System.out.println(file);
		}

	}
	
	public static void deleteFile(File file) {      //Метод для удаления
		if (!file.isDirectory()) {					//всех файлов и папок
			file.delete();							//в папке которую мы хотим удалить
		}else {
			File [] files = file.listFiles();
			for (int i = 0; i < files.length; i++) {
				deleteFile(files[i]);
			}
			file.delete();
		}
	}

}
