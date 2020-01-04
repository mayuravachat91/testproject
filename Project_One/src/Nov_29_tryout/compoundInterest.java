package Nov_29_tryout;

import java.util.Scanner;

public class compoundInterest {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Enter the Principal Sum: ");
		float amt = sc.nextFloat();
		System.out.println("Enter the rate of interest: ");
		float roi = sc.nextFloat();
		System.out.println("Enter the no of year: ");
		int year = sc.nextInt();
		double ci = amt*Math.pow(1.0+roi/100.0,year)-amt;
		System.out.println("Compound Interest is = "+ci);
	}
}
