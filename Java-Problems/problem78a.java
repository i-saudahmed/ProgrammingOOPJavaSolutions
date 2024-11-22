import java.util.Arrays;

public class problem78a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 5, 7 };
//		System.out.println(Arrays.toString(arr));

		if (arr.length == 2) {
			if (arr[0] == 4 || arr[0] == 7) {
				System.out.println(true);
			} else {
				System.out.println(arr[arr.length - 1] == 4 || arr[arr.length - 1] == 7);
			}
		}

	}

}
