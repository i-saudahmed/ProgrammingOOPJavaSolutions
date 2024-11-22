
public class problem73a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "python";
		String str2 = "";
		int len = str1.length();
		int len2 = str2.length();

		if (str1.length() != 0 && str2.length() != 0) {
			System.out.println(str1.substring(0, 1) + str2.substring(str2.length() - 1));
		} else if (str1.length() != 0 && str2.length() == 0) {
			System.out.println(str1.substring(0, 1) + "#");
		} else if (str1.length() == 0 && str2.length() != 0) {
			System.out.println("#" + str2.substring(str2.length() - 1));
		}
	}

}
