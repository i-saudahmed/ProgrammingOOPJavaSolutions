//? "What is the output of this Java program when the user inputs two numbers?"

import java.util.Scanner;

public class problem05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Input 1st Number ");
		int i = sc.nextInt();
		System.out.print("Input 2nd Number ");
		int j = sc.nextInt();
		
		System.out.println(i + " x " + j + "= " + i*j);
	}

}
