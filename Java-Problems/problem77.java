import java.util.Arrays;

public class problem77 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 50, 34, 22 };
		int[] array2 = { 78, 40, 96 };

		int[] myArray = new int[2];
		myArray[0] = array[0];
		myArray[1] = array2[array2.length - 1];

		System.out.println("Array 1 " + Arrays.toString(array));
		System.out.println("Array 2" + Arrays.toString(array2));
		System.out.println("Final Array is " + Arrays.toString(myArray));
	}

}

// array can be printed by converting it into the string so we need to convert it by using Array.toString