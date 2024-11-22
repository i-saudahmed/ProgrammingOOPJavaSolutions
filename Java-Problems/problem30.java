import java.util.Scanner;

public class problem30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Hexa decimal number to convert in octal number");
		String n1 = sc.nextLine();

		int x = Integer.parseInt(n1, 16);
		String octalNumber = Integer.toOctalString(x);
		System.out.println("Equivalent of octal number is " + (octalNumber));
	}

}
