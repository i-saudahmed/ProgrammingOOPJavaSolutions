// add two binary numbers

import java.util.Scanner;

public class problem17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Input first binary number: ");
		String binary1 = sc.next();

		System.out.print("Input Second binary number: ");
		String binary2 = sc.next();

		int decimal1 = Integer.parseInt(binary1, 2);
		int decimal2 = Integer.parseInt(binary2, 2);

		int sum = decimal1 + decimal2;
		String binarySum = Integer.toBinaryString(sum);

		System.out.println("Sum of two binary numbers are " + binarySum);

	}

}

//Scanner sc = new Scanner(System.in);
//System.out.println("Enter 1st Binary Number");
//String x = sc.next();
//
//System.out.println("Enter 2nd Binary Number");
//String y = sc.next();
//
//int n1 = Integer.parseInt(x, 2); // convert input to decimal
//int n2 = Integer.parseInt(y, 2); // convert input to decimal
//int n3 = n1 + n2; // add decimal values
//
//System.out.println("n1 :" + Integer.toBinaryString(n1)); // convert back to binary values
//System.out.println("n2  :" + Integer.toBinaryString(n2));
//System.out.println("Sum of two binary numbers  " + Integer.toBinaryString(n3));

//? This Java program reads two binary numbers as input, converts them to decimal, calculates their sum, and then converts the sum back to binary to display the result.