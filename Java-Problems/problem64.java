import java.util.Scanner;
// Java: Accepts two integer values between 25 to 75 and return true if there is a common digit in both numbers

public class problem64 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Input a number1: ");
		int num1 = sc.nextInt();
		System.out.print("Input a number2: ");
		int num2 = sc.nextInt();
		System.out.println(common_digit(num1, num2));
		// int a = 25/10 ;
		// System.out.println(a);
	}

	public static boolean common_digit(int num1, int num2) {

		if (num1 < 25 && num2 > 75) {
			return false;
		}
		int x = num1 % 10; // if 23 to modulus 3
		int y = num2 % 10; // if 32 to modulus 2

		num1 = num1 / 10; // 23 /10 = 2
		num2 = num2 / 10; // 32 /10 = 3

		return (num1 == num2 || x == y || num1 == y || num2 == x);
	}

}
