import java.util.Scanner;

public class problem65 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Number 1: ");
		int num1 = sc.nextInt();

		System.out.print("Enter Number 2: ");
		int num2 = sc.nextInt();

//		int result = num1 / num2; // result is 2 assuming dividing 19 by 7
//
//		int afinal = (num1 - (result * num2));
//		System.out.print("Modulus is: " + afinal);

		int result = num1 / num2; // 15 / 10 = 1
		int finalresult = (num1 - (result * num2));  // 15 - 1*10
		System.out.println(finalresult);
	}

}
