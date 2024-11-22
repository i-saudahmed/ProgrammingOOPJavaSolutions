import java.util.Arrays;
import java.util.Iterator;

import javax.naming.spi.DirStateFactory.Result;

public class problem83a {
	public static void main(String[] args) {
		String result = "";
		int[] array1 = { 1, 3, -5, 4 };
		int[] array2 = { 1, 4, -5, -2 };
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));

		for (int i = 0; i < array1.length; i++) {
			int num1 = array1[i];
			int num2 = array2[i];
			result = result + Integer.toString(num1 * num2) + " ";

		}
		System.out.println("Result: " + result);

	}

}
