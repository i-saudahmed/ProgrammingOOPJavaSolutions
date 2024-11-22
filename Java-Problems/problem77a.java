import java.util.Arrays;

import javax.naming.spi.DirStateFactory.Result;

public class problem77a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = { 20, 212, 11, 2, 6 };
		int[] arr2 = { 10, 12, 31, 7, 9 };
		System.out.println(Arrays.toString(arr1));

		System.out.println(Arrays.toString(arr2)); 


		int[] new_arr = { arr1[0], arr2[arr2.length - 1] };
		System.out.println(Arrays.toString(new_arr) + " Final Array "); // using Array.toString to convert array into String for human
														// readable form
	}

}
