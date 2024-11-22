import java.util.Scanner;

public class problem54 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Input Number 1");
		int p = sc.nextInt();

		System.out.println("Input Number 2");
		int q = sc.nextInt();

		System.out.println("Input Number 3");
		int r = sc.nextInt();
		System.out.println("Thev result is " + checkNum(p, q, r));
	}

	public static boolean checkNum(int p , int q , int r) {
		return (p % 10 == q % 10 ||q % 10 == r % 10 || p % 10 == r % 10 )  ;
	}
}
