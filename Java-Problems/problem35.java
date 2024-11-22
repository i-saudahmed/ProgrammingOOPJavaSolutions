import java.util.Scanner;

public class problem35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("Please input the Number of sides of polygon : ");
		double polygon = sc.nextDouble();

		System.out.print("Please input the length of the sides : ");
		double length = sc.nextDouble();

		System.out.println("The area is " + areaOfPolygon(polygon, length));
	}

	public static double areaOfPolygon(double polygon, double length) {
		return (polygon * Math.pow(length, 2)) / (4 * Math.tan((Math.PI / polygon)));
	}

}
