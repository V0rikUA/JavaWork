package some;


import java.util.Arrays;

import javax.swing.text.AbstractDocument.LeafElement;

public class Main {

	public static void main(String[] args) {
		// int arrayOne []; for those who came from C++

		// int[] arrayOne; // Use this one for Java coding

		// arrayOne = new int[10];

		// int[] arrayTwo = new int[] { 0, 7, -2, 1 }; // Use this type if you know
		// contains of array
		// System.out.println(arrayTwo[1]);

		// int size = arrayTwo.length;
		// System.out.println(size);

		int[] arrayTwo = new int[] { 0, 7, -2, 1 };
		
		int sum = 0;
		
		for (int i = 0; i < arrayTwo.length; i++) {
			sum = sum+i;
			System.out.println(arrayTwo[i]);
			
		}
		System.out.println();
		System.out.println(sum);
		
		System.out.println(Arrays.toString(arrayTwo));
	}
}