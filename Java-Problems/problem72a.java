
public class problem72a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Python" ; 
		int len = str1.length() ;
		
		if (str1.length() >= 3 ) {
			System.out.println(str1.substring(0, 3));
		}
		else if( str1.length() ==1 ) {
			System.out.println(str1.substring(0) + "##");
		}
		else if( str1.length() ==2 ) {
			System.out.println(str1.substring(0,2) + "#");
		}
		else {
			System.out.println("###");
		}
	}

}
