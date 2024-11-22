import java.util.Scanner;

// capitalize 1st letter of every word 
public class problem58 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Please input the string: ");
		String str = in.nextLine();
		String[] word = str.split(" ");
		for (String s : word) {
			System.out.print(Character.toUpperCase(s.charAt(0)) + s.substring(1, s.length()) + " ");
		}

	}

}