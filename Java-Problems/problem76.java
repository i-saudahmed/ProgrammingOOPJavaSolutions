
public class problem76 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 50, 34, 22, 14, 20 };
		int[] array2 = { 50, 40, 50, 22, 20 };

		boolean result = (array.length >= 2 && array2.length >= 2 && array[0] == array2[0]
				&& array2[array2.length - 1] == array[array.length - 1]);

		System.out.println(result);
	}

}
