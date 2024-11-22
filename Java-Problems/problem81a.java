import java.lang.reflect.Array;
import java.util.Arrays;

public class problem81a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 10, 20, 30 };
		int one, last;
		one = arr[0];
		last = arr[arr.length - 1];
		arr[0] = last;
		arr[arr.length-1] = one;
		System.out.println(Arrays.toString(arr));
	}

}
