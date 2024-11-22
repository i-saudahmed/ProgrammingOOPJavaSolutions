// Write a Java program to find the number of values in a given range divisible by a given value.   
public class problem56 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 5;
		int y = 20;
		int p = 3;

		System.out.println(result(5, 20, 4));
	}

	public static int result(int x, int y, int p) {
		if (x % p == 0) {
			return (y / p - x / p + 1);
		} else {
			return (y / p - x / p);
		}
	}

}
