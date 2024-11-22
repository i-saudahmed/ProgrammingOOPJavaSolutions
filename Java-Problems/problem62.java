import java.util.*;

public class problem62 {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("Input the first number : ");
		int x = in.nextInt(); // Read and store the first number

		System.out.print("Input the second number: ");
		int y = in.nextInt(); // Read and store the second number

		System.out.print("Input the third number : ");
		int z = in.nextInt(); // Read and store the third number

		System.out.println(Math.abs(x - y) >= 20 || Math.abs(y - z) >= 20 || Math.abs(z - x) >= 20);
		
	}
}
