import java.util.Scanner;

public class problem86 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Input the value of n ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while (n != 1) {
			if (n % 2 == 0) {
				n = n / 2;
			} else {
				n = (n * 3 + 1);
			}
		}
		System.out.println("Value of n " + n);

		sc.close();

	}

}
