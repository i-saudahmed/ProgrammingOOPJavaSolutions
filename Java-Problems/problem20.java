import java.util.Scanner;

// decimal to hexadecimal 
public class problem20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please Enter the number: ");
		String num1 = sc.next();

		int decimal = Integer.parseInt(num1);

		String hexa_decimal = Integer.toHexString(decimal);

		System.out.println("Hexa decimal number is: " + hexa_decimal);
		sc.close();
	}
}

//Scanner scanner = new Scanner(System.in);
//System.out.print("Enter a decimal number: ");
//int decimal = scanner.nextInt();
//
//String hexadecimal = Integer.toHexString(decimal);
//
//System.out.println("Hexadecimal representation: " + hexadecimal);