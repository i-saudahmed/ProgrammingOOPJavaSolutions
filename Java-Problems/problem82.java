import java.util.Arrays;

public class problem82 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numsarray[] = { 222, 34, 22, 56, 29 };
		int max_value = numsarray[0];
		if (max_value <= numsarray[numsarray.length - 1])
			max_value = numsarray[numsarray.length - 1];

		if (max_value <= numsarray[numsarray.length / 2])
			max_value = numsarray[numsarray.length /2];

		System.out.println("Largest element between First Middle and largest element is " + max_value);
	}

}
