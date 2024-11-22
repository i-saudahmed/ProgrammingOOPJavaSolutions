import java.util.Scanner;

public class problem63 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.print("Input the first number: ");
		int num1 = sc.nextInt();

		System.out.print("Input the second number: ");
		int num2 = sc.nextInt();

		System.out.println("Result is " + checknum(num1, num2));

	}

	public static int checknum(int num1, int num2) {
		if (num1 > num2) {
			return num1;
		}
		if (num1 == num2) {
			return 0;
		}
		if (num1 % 6 == num2 % 6 && num1 < num2) {
			return num1;
		} else {
			return num2;
		}
	}
}