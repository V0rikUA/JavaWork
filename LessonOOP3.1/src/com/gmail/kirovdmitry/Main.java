package com.gmail.kirovdmitry;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		double a;
		for (;;) {
			try {
				a = Double.valueOf(JOptionPane.showInputDialog("Input double number"));
				break;
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Error number format");
			} catch (NullPointerException e) {
				JOptionPane.showMessageDialog(null, "Cancel. Set default volume = 10");
				a = 10;
				break;
			}
		}
		System.out.println(a);
	}
}