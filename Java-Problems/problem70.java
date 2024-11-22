
public class problem70 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Python";
		String str2 = "Tutuorial";

		if (str1.length() == str2.length()) {
			return ;
		} else if (str1.length() > str2.length()) {
			System.out.println(str2 + str1 + str2);
		} else {
			System.out.println(str1 + str2 + str1);
		}
	}

}