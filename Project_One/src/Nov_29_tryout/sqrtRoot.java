package Nov_29_tryout;

import java.util.Scanner;

public class sqrtRoot {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Enter the no: ");
		double a= sc.nextInt();
		double sqrtRoot = Math.sqrt(a);
		System.out.println("Sqrt Root: "+sqrtRoot);
	}
}
