package com.gmail.kirovdmitry;

public class Cat {

	private String color;
	private double age;
	private double weight;
	private double lenght;

	public Cat(String color, double age, double weight, double lenght) {
		super();
		this.color = color;
		this.age = age;
		this.weight = weight;
		this.lenght = lenght;
	}

	public Cat() {
		super();
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getAge() {
		return age;
	}

	public void setAge(double age) {
		this.age = age;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getLenght() {
		return lenght;
	}

	public void setLenght(double lenght) {
		this.lenght = lenght;
	}

	@Override
	public String toString() {
		return "Cat [color=" + color + ", age=" + age + " years" + ", weight=" + weight + " kg." + ", lenght=" + lenght
				+ " cm" + "]";
	}

}
