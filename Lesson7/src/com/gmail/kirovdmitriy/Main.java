package com.gmail.kirovdmitriy;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date dateOne = new Date();
		SimpleDateFormat sdfOne = new SimpleDateFormat("dd MM yyyy");
		SimpleDateFormat sdfTwo = new SimpleDateFormat("dd/MM/yyyy");

		String myDateText = "11/10/1981";

		try {
			dateOne = sdfTwo.parse(myDateText);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		String textDate = sdfOne.format(dateOne);
		System.out.println(textDate);
		System.out.println(dateOne.getTime());

		System.out.println();
		
		String textDate1 = sdfTwo.format(dateOne);
		System.out.println(textDate1);
		System.out.println(dateOne.getTime());

	}

}
