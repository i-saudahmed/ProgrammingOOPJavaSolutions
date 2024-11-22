import java.awt.image.RescaleOp;

public class problem67 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String main_string = "Python is a programming language";
		String word = "Server side and";

		String result = main_string.substring(0, 12) + word + main_string.substring(11);
		System.out.println(result);

	}

}
