import java.util.Scanner;

public class problem55 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("please input Total Seconds: ");
		int seconds = sc.nextInt();

		int s = seconds % 60;
		System.out.println("Total Seconds: " + s);

		int m = seconds / 60;
		int mm = m / 60;
		int mmm = m % 60; // remaining minutes
		System.out.println("Total Minutes: " + mmm);
		System.out.println("Total Hours: " + mm);

	}

}
