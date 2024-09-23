import java.util.Scanner;

// binary to hexa
public class problem23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Please Enter the Binary Number:");
		String num1 = sc.nextLine();

		int decimal = Integer.parseInt(num1, 2);
		String final_r = Integer.toHexString(decimal);

		System.out.println("Hexa Decimal Number: " + final_r);
	}

}
