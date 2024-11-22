import java.util.Scanner;

public class problem34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Please input the side of hexagon: ");
		double s = sc.nextDouble();
		System.out.println("The output is " + hexagonArea(s));

	}

	public static double hexagonArea(double s) {
		return (6 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / 6));
	}

}

//Scanner sc = new Scanner(System.in);
//System.out.println("Input the length of a side of the hexagon: ");
//double s = sc.nextDouble();
//double area =  ( (6*s *s ))  / (  4 * Math.tan( Math.PI / 6) ) ; 
//System.out.println(area);