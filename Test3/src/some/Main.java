package some;

import java.util.Arrays;
import java.util.Random; //Ctrl+Shift+O auto import of all necessary UTIL 

public class Main {

	public static void main(String[] args) { //
		int[] arrayTwo = new int[12];
		Random rn = new Random();

		for (int i = 0; i < arrayTwo.length; i++) {
			arrayTwo[i] = 17000 + rn.nextInt(8000);

		}

		int sum = 0;

		for (int i = 0; i < arrayTwo.length; i++) {
			sum = sum + arrayTwo[i];

		}

		System.out.println(sum / arrayTwo.length);

		System.out.println(Arrays.toString(arrayTwo));

		int[] b = Arrays.copyOfRange(arrayTwo, 1, 5);
		System.out.println(Arrays.toString(b));
		Arrays.sort(b);
		System.out.println(Arrays.toString(b));
	}

}