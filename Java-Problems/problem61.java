import java.util.Iterator;
import java.util.Scanner;

public class problem61 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("Input a string : ");
		String word = s.nextLine();
		word = word.trim();
		char[] ch = word.toCharArray();
		String result = "";
		for (int i = ch.length - 1; i >= 0; i--) {
			result = result + ch[i];
		}
		System.out.println("Result is : " + result);
	}
}
