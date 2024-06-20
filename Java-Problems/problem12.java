import java.util.Scanner;

public class problem12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number 1: ");
		int a = sc.nextInt();

		System.out.print("Enter a number 2: ");
		int b = sc.nextInt();

		System.out.print("Enter a number 3: ");
		int c = sc.nextInt();

		int result = (a + b + c) / 3;
		System.out.println("Result is " + result);
	}

}

//? The program accepts three numbers as input and calculates their average.
