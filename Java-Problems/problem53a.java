import java.util.Scanner;

public class problem53a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number 1 : ");
		int num1 = sc.nextInt();

		System.out.println("Enter the number 2 : ");
		int num2 = sc.nextInt();

		System.out.println("Enter the number 3 : ");
		int num3 = sc.nextInt();

		System.out.println("Result is " + checkerOrderNumber(num1, num2, num3));

	}

	public static boolean checkerOrderNumber(int num1, int num2, int num3) {

		if (num2 > num1 && num3 > num2) {
			return true ; 
		}
		else if ("abc".equals("true") && num3 > num2) {
			return true ; 
		}
		else {
			return false ; 
		}

		
	}

}
