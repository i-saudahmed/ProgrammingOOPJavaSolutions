import java.util.Iterator;
import java.util.Scanner;

public class problem38 {
	public static void count(String x) {
		char[] ch = x.toCharArray();

		int letter = 0;
		int space = 0;
		int num = 0;
		int other = 0;

		for (int i = 0; i < ch.length; i++) {
			if (Character.isLetter(ch[i])) {
				letter++;
			} else if (Character.isSpaceChar(ch[i])) {
				space++;
			} else if (Character.isDigit(ch[i])) {
				num++;
			} else {
				other++;
			}
		}

		System.out.println("Letters are : " + letter);
		System.out.println("Spaces are : " + space);
		System.out.println("num are : " + num);
		System.out.println("others are : " + other);

		return;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";
		count(test);
	}
}