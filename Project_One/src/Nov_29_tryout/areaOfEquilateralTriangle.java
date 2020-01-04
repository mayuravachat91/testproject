package Nov_29_tryout;

import java.util.Scanner;

public class areaOfEquilateralTriangle {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Enter the side of the triangle: ");
		double a= sc.nextDouble();
		double area = (Math.sqrt(3)/4)*(a*a);
		System.out.println("Equilateral Triangle: "+area);
	}
}
