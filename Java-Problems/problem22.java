import java.util.Scanner;

// binary to decimal
public class problem22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Please Enter the Binary Number:");
		String num1 = sc.nextLine();

		int final_r = Integer.parseInt(num1, 2);

		System.out.println("Decimal Number: " + final_r);

	}

}
