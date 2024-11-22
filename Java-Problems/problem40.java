import java.nio.charset.Charset;

public class problem40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("List of available charsets are: ");
		
		for(String str : Charset.availableCharsets().keySet()) {
			System.out.println(str);
		}
	}

}
