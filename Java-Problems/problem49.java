import java.util.Scanner;

public class problem49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Input a number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if(n%2 == 0) {
			System.out.println("Even 1");
		}
		else if(n%2 != 0 ) {
			System.out.println("Odd 0 ");
		}
	}

}
