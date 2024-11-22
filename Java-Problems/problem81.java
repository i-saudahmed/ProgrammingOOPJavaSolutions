import java.util.Arrays;

public class problem81 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int last, zero;
		int array[] = { 20, 30, 40, 50 };
		System.out.println("Original Array: " + Arrays.toString(array));
		last = array[array.length - 1];
		zero = array[0];
		array[0] = last;
		array[array.length - 1] = zero;
		System.out.println("Swapped Array is " + Arrays.toString(array));
	}

}
