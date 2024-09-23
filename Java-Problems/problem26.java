import java.util.Scanner;
// binary to octal
public class problem26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter octal number to convert in binary number");
		String n1 = sc.nextLine();
		
		int x = Integer.parseInt(n1,8);
		String binaryString = Integer.toBinaryString(x);
		System.out.println("binary is " + (binaryString));
	}

}
