
// int to binary number
import java.util.Scanner;

public class problem19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the integer number: ");
		int n = sc.nextInt();

		String result = Integer.toBinaryString(n);

		System.out.println("Binary number is: " + result);

	}

}
