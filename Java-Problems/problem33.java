import java.util.Scanner;

// add sum of numbers 126-> 9
public class problem33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int n = 0;
		n = sc.nextInt();

		while (n > 0) {
			int reminder = n % 10;
			sum = sum + reminder;
			n = n / 10;
		}
		System.out.printf("Sum of the digits: %d", sum);
	}

}

//int n ,r , sum = 0; 
//System.out.println("Enter the number: ");
//Scanner sc= new Scanner(System.in);
// n = sc.nextInt();
//while(n>0) {
//	r = n%10;
//	sum = sum + r ;
//	n = n/10 ;
//}
//System.out.println(sum);