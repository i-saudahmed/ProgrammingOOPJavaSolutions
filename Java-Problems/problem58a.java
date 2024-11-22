
public class problem58a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "the quick brown fox jumps over the lazy dog." ;
		String [] word  = str.split(" ");
		
		for (String s : word) {
			System.out.print(Character.toUpperCase(s.charAt(0))+ s.substring(1,s.length())+" ");
		}
	}

}
