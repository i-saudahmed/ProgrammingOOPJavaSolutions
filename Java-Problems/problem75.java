
public class problem75 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 50, 34, 22, 14, 55, 78, 40, 50 };

		boolean result = (array.length >= 2 && array[0] == array[array.length - 1]);

		System.out.println(result);
	}

}
