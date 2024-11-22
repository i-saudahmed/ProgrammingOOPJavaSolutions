import java.util.Scanner;

// right most
public class problem54a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number 1 : ");
		int num1 = sc.nextInt();

		System.out.println("Enter the number 2 : ");
		int num2 = sc.nextInt();

		System.out.println("Enter the number 3 : ");
		int num3 = sc.nextInt();

		System.out.println("REsult : " + checkRightMost(num1, num2, num3));
	}

	public static boolean checkRightMost(int num1, int num2, int num3) {
		if (num1 % 10 == num2 % 10 || num2 % 10 == num3 % 10 || num1 % 10 == num3 % 10) {
			return true;

		} else {
			return false;
		}
	}

}
