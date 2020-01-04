package Nov_29_tryout;

import java.util.Scanner;

public class daysConverter {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Enter the days: ");
		int days = sc.nextInt();
		System.out.println("In year :"+days/365);
		System.out.println("In week :"+(days%365)/7);
		System.out.println("In days :"+(days%365)%7);
		//System.out.println("In months :"+(days%365)%12);
	}
}
