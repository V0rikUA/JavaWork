package com.gmail.kirovdmitry;

public class Main {

	public static void main(String[] args) {
		Cat catOne = new Cat(5, 7, true, "Milk", "Sara", "Home Cat");

		System.out.println(catOne.getWeigt());

		catOne.getVoice();
		System.out.println(catOne);

		Animals anim = catOne;
		anim.getVoice();

		System.out.println(anim);
	}

}
