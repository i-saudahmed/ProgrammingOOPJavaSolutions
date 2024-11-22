import java.util.Scanner;

public class problem37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.printf("Please the type string that you want to reverse");
		char[] letters = sc.nextLine().toCharArray();

		for (int i = letters.length - 1; i >= 0; i--) {
			System.out.print("Reversed string: " + letters[i]);
		}
	}

}

//Scanner sc = new Scanner(System.in);
//System.out.print("Input a string:  ");
//char [] letters = sc.nextLine().toCharArray();
//
//System.out.print("Reverse String: ");
//
//for(int i= letters.length-1; i>=0;i--) {
//	System.out.print(letters[i]);}