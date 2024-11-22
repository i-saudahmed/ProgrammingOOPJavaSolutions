import java.util.Arrays;
import java.util.Iterator;

public class problem78 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int myArr[] = { 4, 7 };
		System.out.println("Original Array " + Arrays.toString(myArr));
		for (int i = 0; i < myArr.length - 1; i++) {
			if (myArr[i] == 4 || myArr[i] == 7) {
				System.out.println(true);
			}
		}
	}

}
