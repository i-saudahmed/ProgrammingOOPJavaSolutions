
public class problem73 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Python";
		String str2 = "Language";
		int length = str2.length();

		String result = "";

		result += ((str1.length() > 1) ? str1.charAt(0) : '#');
		result += (length >= 1) ? str2.charAt(length-1) : '#';


		System.out.println("Result is " + result + "");
	}

}
