import java.util.Scanner;

// binary to octal
public class problem24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Please Enter the Binary Number:");
		String num1 = sc.nextLine();

		int decimal = Integer.parseInt(num1, 2);
		String final_r = Integer.toOctalString(decimal);

		System.out.println("Octal Number: " + final_r);
	}

}

//Scanner sc = new Scanner(System.in);
//System.out.println("Enter binary number");
//String n1 = sc.nextLine();
//
//int x = Integer.parseInt(n1 , 2);
//System.out.println("Hexadecimal is " + Integer.toOctalString(x));