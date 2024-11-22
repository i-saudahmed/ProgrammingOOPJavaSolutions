import java.util.Scanner;

public class problem29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Hexa decimal number to convert in binary number");
		String n1 = sc.nextLine();
		
		int x = Integer.parseInt(n1,16);
		String binaryNumber = Integer.toBinaryString(x);
		System.out.println("Equivalent Binary Number is:" + (binaryNumber));
	}

}
