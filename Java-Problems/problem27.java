import java.util.Scanner;

public class problem27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter octal number to convert it in hexa decimal number");
		String n1 = sc.nextLine();
		
		int x = Integer.parseInt(n1,8);
		String binaryString = Integer.toHexString(x);
		System.out.println("binary is " + (binaryString));
	}

}
