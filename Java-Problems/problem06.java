import java.util.Scanner;

public class problem06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number for Table ");
		int a = sc.nextInt();

		for(int i = 1 ; i<=10 ; i++) {
			System.out.println(a + " x " + i + " = " + a*i );
		}
	
	}

}


//? print a table