package Nov_29_tryout;

import java.util.Scanner;

public class simpleInterest {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Enter the Principal Sum: ");
		float amt = sc.nextFloat();
		System.out.println("Enter the rate of interest: ");
		float roi = sc.nextFloat();
		System.out.println("Enter the no of year: ");
		int year = sc.nextInt();
		float si =(amt*roi*year)/100;
		System.out.println("Simple Interest is = "+si);
	}

}
