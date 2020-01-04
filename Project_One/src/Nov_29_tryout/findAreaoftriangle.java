package Nov_29_tryout;

import java.util.Scanner;

public class findAreaoftriangle {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Enter the height and width: ");
		double height = sc.nextDouble();
		double base = sc.nextDouble();
		double area = (base* height)/2;
		System.out.println("Area of Triangle: "+area);
	}
}
