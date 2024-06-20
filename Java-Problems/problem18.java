import java.util.Scanner;

public class problem18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("Input first number: ");
		String binary1 = sc.next();

		System.out.print("Input first number: ");
		String binary2 = sc.next();

		int decimal1 = Integer.parseInt(binary1, 2);
		int decimal2 = Integer.parseInt(binary2, 2);
		int multiplied_result = decimal1 * decimal2;

		String finalProduct = Integer.toBinaryString(multiplied_result);

		System.out.println("\nProduct of two binary number is: " + finalProduct);

	}

}

//? This Java program reads two binary numbers as input, converts them to decimal, multiplies them, and then converts the result back to binary to display the final product.