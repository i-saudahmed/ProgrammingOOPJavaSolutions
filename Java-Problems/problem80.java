import java.util.Arrays;

public class problem80 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = { 20, 30, 40 };
		int max = array[0];
		if (array[array.length - 1] > max) {
			max = array[array.length-1];
		}
		System.out.println(max);
	}

}
