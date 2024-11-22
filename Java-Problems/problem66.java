import java.util.Iterator;
import java.util.Scanner;
// prime are those who come in only in their own table 
public class problem66 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;

		for (int i = 2; i <= 100; i++) {
			boolean isPrime = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				sum += i;
			}
		}
		System.out.println("sum of all first 100 primes numbers are : " + sum);
	}
}
