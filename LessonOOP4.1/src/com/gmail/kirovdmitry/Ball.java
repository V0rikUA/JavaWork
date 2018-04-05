package com.gmail.kirovdmitry;

public class Ball implements Play, Comparable {
	private String color;
	private int size;

	public Ball() {
	}

	public Ball(String color, int size) {
		this.color = color;
		this.size = size;
	}

	@Override
	public boolean canPlay() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public String playWith() {
		// TODO Auto-generated method stub
		return "Bams-Bams!!";
	}

	public int compareTo(Object o) {
		Ball anotherBall = (Ball) o;

		if (this.size > anotherBall.size) {
			return 1;
		}
		if (this.size < anotherBall.size) {
			return -1;
		}

		return 0;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Ball [color=" + color + ", size=" + size + "]";
	}

}
