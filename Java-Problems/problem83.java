import java.util.Arrays;
import java.util.Iterator;

public class problem83 {

	public static void main(String[] args) {
		String result = "";
		// TODO Auto-generated method stub
		int array1[] = { 1, 3, -5, 4 };
		int array2[] = { 1, 4, -5, -2 };

		System.out.println("Array 1 : " + Arrays.toString(array1));
		System.out.println("Array 2 : " + Arrays.toString(array2));
		for (int i = 0; i < array1.length; i++) {
			result = result + " " + array1[i] * array2[i];
		}

		System.out.println("Result : " + result);
	}

}