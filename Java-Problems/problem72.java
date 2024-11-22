
public class problem72 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Py";
		int len = str1.length();

		if (len >= 3) {
			System.out.println(str1.substring(0, 3));
		} else if (len == 1) {
			System.out.println(str1.charAt(0) + "##");	// CharAt will Get the character at particular index 
		}
		else if (len ==2) {
			System.out.println(str1.substring(0,2) + "#");
		}
		else {
			System.out.println("###");
		}

	}
}
