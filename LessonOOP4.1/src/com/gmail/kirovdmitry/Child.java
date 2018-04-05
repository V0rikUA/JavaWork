package com.gmail.kirovdmitry;

public class Child {
	private String name;
	private String lastName;
	private int age;

	public Child() {
	}

	public Child(String name, String lastName, int age) {
		this.name = name;
		this.lastName = lastName;
		this.age = age;
	}

	public String playWithSomething(Play something) {
		if (!something.canPlay()) {
			return "I cannot play whith " + something;
		}
		return "I play with " + something 
				+ System.lineSeparator() 
				+ something.playWith();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Child [name=" + name + ", lastName=" + lastName + ", age=" + age + "]";
	}

}
