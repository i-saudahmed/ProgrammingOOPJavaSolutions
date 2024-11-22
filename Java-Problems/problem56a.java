
public class problem56a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 5;
		int y = 19;
		int p = 3;
		System.out.println("Result  " + result(x, y, p));
	}

	public static int result(int x, int y, int p) {
		if (x % p == 0) {
			return (y / p - x / p + 1);
		}
		return (y / p - x / p);
	}

}
