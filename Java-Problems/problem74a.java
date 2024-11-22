import javax.naming.spi.DirStateFactory.Result;

public class problem74a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num_array = { 10, 2, 44, 756, 4, 44 };
		boolean result = false;
		if (num_array.length >= 2) {
			result = (num_array[0] == 10 || num_array[num_array.length - 1] == 10);
		}
		System.out.println(result);
	}
}
