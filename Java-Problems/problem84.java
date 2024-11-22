import javax.swing.text.AbstractDocument.LeafElement;

public class problem84 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Python";
		String result = "";
		int length = str1.length();

		if (str1.length() > 3) {
			result = str1.substring(length - 3);
		}

		System.out.println(result + str1 + result);
	}

}
