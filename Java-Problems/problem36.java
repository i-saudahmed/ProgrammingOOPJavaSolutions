import java.util.Scanner;

public class problem36 {
	public static double distance_Between_LatLong(double la1, double lo1, double la2, double lo2) {
		la1 = Math.toRadians(la1);
		la2 = Math.toRadians(la2);
		lo1 = Math.toRadians(lo1);
		lo1 = Math.toRadians(lo2);
		double r = 6371.01;
		return r * Math.acos(Math.sin(la1) * Math.sin(la2) + Math.cos(la1) * Math.cos(la2) * Math.cos(lo1 - lo2));

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Input the latitude of coordinate 1 : ");
		double la1 = sc.nextDouble();

		System.out.println("Input the longtitude of coordinate 1 : ");
		double lo1 = sc.nextDouble();

		System.out.println("Input the latitude of coordinate 2 : ");
		double la2 = sc.nextDouble();

		System.out.println("Input the longtitude of coordinate 2 : ");
		double lo2 = sc.nextDouble();

		System.out.print(
				"The distance between those points is: " + distance_Between_LatLong(la1, lo1, la2, lo2) + " km\n");

	}

}
