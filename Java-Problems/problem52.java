import java.util.Scanner;

public class problem52 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Input the First number: ");
		int p = sc.nextInt();

		System.out.print("Input the Second number: ");
		int q = sc.nextInt();

		System.out.print("Input the Third number: ");
		int r = sc.nextInt();

		System.out.print("Result is : " + sumoftwo(p, q, r));
	}

	public static boolean sumoftwo(int p, int q, int r) {
		return ((p + q) == r || (q + r) == p || (p + r) == q);
	}

}
