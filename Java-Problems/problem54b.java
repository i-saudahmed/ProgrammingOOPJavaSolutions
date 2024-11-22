import java.util.Scanner;

// left most 
public class problem54b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number 1 : ");
		int num1 = sc.nextInt();

		System.out.println("Enter the number 2 : ");
		int num2 = sc.nextInt();

		System.out.println("Enter the number 3 : ");
		int num3 = sc.nextInt();

		System.out.println("REsult : " + checkLeftMost(num1, num2, num3));
	}

	public static boolean checkLeftMost(int num1, int num2, int num3) {
		while (num1 >= 10) {
			num1 /= 10;
		}
		while (num2 >= 10) {
			num2 /= 10;
		}
		while (num3 >= 10) {
			num3 /= 10;
		}

		return num1 == num2 || num1 == num3 || num2 == num3;
	}

}
