package com.gmail.kirovdmitry;

public class Cat extends Animals {

	private String name;
	private String type;

	public Cat(int age, double weigt, boolean sex, String ration, String name, String type) {
		super(age, weigt, sex, ration);
		this.name = name;
		this.type = type;
	}

	public Cat() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	@Override                           //������������ ��� ������� ������. ��� ���� ����� ��������� ���������. ���� ���� �������������� � ������� � �������� �� ��������� �� �����������
	public void getVoice() {
		System.out.println("Nya-Nya");
	}

	@Override
	public String toString() {
		return "Cat [name=" + name + ", type=" + type + ", toString()=" + super.toString() + "]";
	}
 
}

