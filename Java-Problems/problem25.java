import java.util.Scanner;

// octal to decimal
public class problem25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Input the octal number to convert into decimal number.: ");
		String num1 = sc.nextLine();

		int decimal_result = Integer.parseInt(num1, 8);
		System.out.println("Equivalent decimal Number is: " + decimal_result);
	}

}

//Scanner sc = new Scanner(System.in);
//System.out.println("Enter octal number");
//String n1 = sc.nextLine();
//
//int x = Integer.parseInt(n1 , 8);
//System.out.println("decimal is " + (x));