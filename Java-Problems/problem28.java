import java.util.Scanner;

public class problem28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Hexa decimal number to convert in decimal number");
		String n1 = sc.nextLine();
		
		int x = Integer.parseInt(n1,16);
		System.out.println("Equivalent decimal number is: " + (x));
	}

}
