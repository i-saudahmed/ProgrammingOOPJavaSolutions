import java.util.*;

public class Problem60 {
	public static void main(String[] args) {

		String str = "Saud    is       from         karachi";
		String[] word = str.split("[ ]+");  // ignore the extra spaces form string
		// String[] words = line.split(" ");
		System.out.println("Penultimate word is : " + word[word.length - 2]);
	}
}
