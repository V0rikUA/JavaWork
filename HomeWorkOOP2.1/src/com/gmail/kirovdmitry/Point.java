package com.gmail.kirovdmitry;

public class Point extends Shape {

	private double x;
	private double y;

	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public Point() {
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	@Override
	double getPerimetr() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	double getArea() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
